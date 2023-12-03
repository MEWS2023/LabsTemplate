package at.ac.tuwien.big.scml.codegen.lib;

import java.util.Map;

public interface SmartCityRunner {
	
	public void setup(Map<String, DataSource<?>> dataSources);

	
	public void step();
}
