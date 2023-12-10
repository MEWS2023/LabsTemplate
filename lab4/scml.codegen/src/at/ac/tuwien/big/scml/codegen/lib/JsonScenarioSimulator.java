package at.ac.tuwien.big.scml.codegen.lib;

import java.io.IOException;
import java.util.Map;

public class JsonScenarioSimulator {
	
	private Map<String, Integer> valueAggregationLimitMap;
	private Map<String, Map<String, DataSource<String>>> dataSources;
	
	public int setUpDataLoaders(SmartCityRunner runner, String filePath) throws IOException {
		
		DataSourceLoader loader = new DataSourceLoader();
		valueAggregationLimitMap = loader.getValueAggregationLimitMap(filePath);
		dataSources = loader.getDataSources(filePath);
		int length = getMaximalQueueLength(dataSources);
		
		runner.setup(dataSources, valueAggregationLimitMap);
		
		return length;
	}
	
	public void simulate(SmartCityRunner runner, String filePath) {
		
		try {
			
			int length = setUpDataLoaders(runner, filePath);
			
			for (int i = 0; i < length; i++) {
				
				runner.step();
			}	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void simulateStepwise(SmartCityRunner runner, String filePath) {
		
		try {
			int length = setUpDataLoaders(runner, filePath);
			
			byte[] buffer = new byte[256];
			int steps = 0;
//			
			while (length > 0) {
				System.out.println(Util.ANSI_GREEN + "Hit <enter> to simulate the next step.");
				System.out.println("Type in a <number> to simulate a number of steps.");
				System.out.println("Type in <run> to simulate the remaining scenario.");
				System.out.println("Type in <exit> to stop the simulation." + Util.ANSI_RESET);
				System.in.read(buffer);
				steps = 1;
				String cmd = new String(buffer).trim().toLowerCase();
				if ("exit".equals(cmd)) {
					return;
				} else if ("run".equals(cmd)) {
					steps = length;
				} else {
					try {
						steps = Integer.parseInt(cmd);
					} catch (NumberFormatException e) {
						// nothing
					}
				}
				
				while (steps > 0 && length > 0) {
					runner.step();
					steps--;
					length--;
				}
			}	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private int getMaximalQueueLength(Map<String, Map<String, DataSource<String>>> dataSources) {
		int max = 0;
		for(Map<String, DataSource<String>> projectComponentDatasources : dataSources.values()) {
			for(DataSource<?> source : projectComponentDatasources.values()) {
				int length = source.getQueueLength();
				if (max < length) max = length;
			}
		}
		return max;
	}

}
