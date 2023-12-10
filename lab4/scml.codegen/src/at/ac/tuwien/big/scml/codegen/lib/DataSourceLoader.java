package at.ac.tuwien.big.scml.codegen.lib;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.io.FileReader;


import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;


public class DataSourceLoader {

	/**
	 * Creates a Map of DataSource Objects for the simulation of a SmartGrid. 
	 * The data values are read from a JSON file.
	 * 
	 * @param filePath path to the json file containing the sensor values
	 * @return Map<"NodeName", Map<"Node_parameter", DataSource>>
	 * @throws IOException if the file could not be read
	 */
	
	public Map<String, Integer> getValueAggregationLimitMap(String filePath) throws IOException {
		Map<String, Integer> projectKpiIntervalMap = new HashMap<String, Integer>();
		
		try {
			Gson gson = new Gson();
            JsonObject json = gson.fromJson(new FileReader(filePath), JsonObject.class);
            
            JsonArray projects = json.getAsJsonArray("projects");
            
            for (int i = 0; i < projects.size(); i++) {
                JsonObject projectObject = projects.get(i).getAsJsonObject();
                
                Set<Map.Entry<String, JsonElement>> projectEntries = projectObject.entrySet();

                for (Map.Entry<String, JsonElement> projectEntry : projectEntries) {
                    String projectName = projectEntry.getKey();
                    JsonObject projectDetails = projectEntry.getValue().getAsJsonObject();
                    
                    Integer kpiInterval = projectDetails.get("valueAggregationLimit").getAsInt();
                    
                    projectKpiIntervalMap.put(projectName, kpiInterval);

                }
            }
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return projectKpiIntervalMap;
	}
	
	
	public <T> Map<String, Map<String, DataSource<String>>> getDataSources(String scenarioFile) throws IOException {
		
		Map<String, Map<String, DataSource<String>>> dataSourceMap = new HashMap<String, Map<String, DataSource<String>>>();
		
		try {
			Gson gson = new Gson();
            JsonObject json = gson.fromJson(new FileReader(scenarioFile), JsonObject.class);
            
            JsonArray projects = json.getAsJsonArray("projects");
            
            for (int i = 0; i < projects.size(); i++) {
                JsonObject projectObject = projects.get(i).getAsJsonObject();
                
                Set<Map.Entry<String, JsonElement>> projectEntries = projectObject.entrySet();

                for (Map.Entry<String, JsonElement> projectEntry : projectEntries) {
                	String projectName = projectEntry.getKey();
                	
                	JsonObject projectDetails = projectEntry.getValue().getAsJsonObject();
                    JsonObject components = projectDetails.getAsJsonObject("components");
                    Set<Map.Entry<String, JsonElement>> componentEntries = components.entrySet();

                    Map<String, DataSource<String> > projectComponentMap = new HashMap<String, DataSource<String> >();
                    
                    for (Map.Entry<String, JsonElement> componentEntry : componentEntries) {
                        String componentName = componentEntry.getKey();
                        
                        JsonObject componetDetails = componentEntry.getValue().getAsJsonObject();
                        JsonArray values = componetDetails.getAsJsonArray("values");
                        DataSource<String> dataSource = new DataSource<String>();
                        
                        for (JsonElement element: values) {
                        	String stringValue = element.getAsString();                        	
                        	dataSource.fill(stringValue);
                        }
                        
                        projectComponentMap.put(componentName, dataSource);
                        
                    }
                    
                    dataSourceMap.put(projectName, projectComponentMap);
                }
            }
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return dataSourceMap;
	}
	
}
