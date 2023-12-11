package vienna.parameter;

import java.util.List;

import at.ac.tuwien.big.scml.codegen.lib.GoalReferenceValue;
import at.ac.tuwien.big.scml.codegen.lib.AggregatedValue;
import at.ac.tuwien.big.scml.codegen.lib.Producer;
import at.ac.tuwien.big.scml.codegen.lib.Aggregator;
import at.ac.tuwien.big.scml.codegen.lib.DataValue;

import vienna.component.GETurkenschanzpark;


public class GECo2Content extends Aggregator {
	private GETurkenschanzpark gETurkenschanzpark;
	
	public GECo2Content(Producer producer){
		super
		(
			"gECo2Content", 
			new AggregatedValue("AVG", "FLOAT"), 
			new GoalReferenceValue("5", "FLOAT")
		);
		gETurkenschanzpark = (GETurkenschanzpark) producer;
	}
	
	public AggregatedValue getgECo2ContentAggregatedValue(){
		return this.getAggregatedValue();
	}
	
	public GoalReferenceValue gECo2ContentGoalReferenceValue(){
		return this.getGoalReferenceValue();
	}
	
	@Override
	public void aggregate(List<DataValue> values){
		this.aggregatedValue.update(values);
		System.out.println("	Aggregated Value for " + gETurkenschanzpark.name + " = " + this.aggregatedValue.getValue() + " with " + this.aggregatedValue.aggregator + " aggregation function");
	}
	
	public void step(){
		 this.aggregate(gETurkenschanzpark.collect());
	}
}
