package at.ac.tuwien.big.scml.codegen.lib;

import java.util.Map;

public interface SmartCityRunner {
	
	public void setup(Map<String, Map<String, DataSource<String>>> dataSources, Map<String, Integer> valueAggregationLimitMap);

	
	public void step();
}
