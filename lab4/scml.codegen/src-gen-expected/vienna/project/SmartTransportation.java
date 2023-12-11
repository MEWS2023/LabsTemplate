
package vienna.project;
		
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import at.ac.tuwien.big.scml.codegen.lib.DataValue;
import at.ac.tuwien.big.scml.codegen.lib.Producer;
import at.ac.tuwien.big.scml.codegen.lib.Indicator;


public class SmartTransportation {
	
	private int steps;
	private List<String> categories;
	private List<Producer> components;
	private List<Indicator> indicators;
	
	private int aggregationLimit;
	public String name;
			
	
	public SmartTransportation(String name, int valueAggregationLimit) {
		this.name = name;
		this.steps = 0;
		this.aggregationLimit = valueAggregationLimit;
		this.categories = Arrays.asList("Transportation");
		
		
		components = new ArrayList<Producer>();
		indicators = new ArrayList<Indicator>();
		
	}
	
	public void addComponent(Producer component){
		components.add(component);
	}
	
	public void addIndicator(Indicator indicator){
		indicators.add(indicator);
	}
	
	public void step(){
		this.produce();
	}
	
	public void produce(){
		for(Producer c: components){
			DataValue dataValue = c.produce();
			
			if(dataValue != null){
				System.out.println("Data Produced by " + c.name + ": " + dataValue.getValue());	
			}
		}
		steps += 1;
		if(steps % aggregationLimit == 0){
			for(Indicator indicator: indicators){
				System.out.println("Aggregating data for " + name + " and Indicator " + indicator.name);
				indicator.aggregate();
			}
		}
	}
	
	public List<String> getSmartTransportationCategories(){
		return categories;
	}
	
	public String toString(){
		return name;
	}
}
