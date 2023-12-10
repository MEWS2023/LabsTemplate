package vienna.parameter;

import java.util.List;

import at.ac.tuwien.big.scml.codegen.lib.GoalReferenceValue;
import at.ac.tuwien.big.scml.codegen.lib.AggregatedValue;
import at.ac.tuwien.big.scml.codegen.lib.Producer;
import at.ac.tuwien.big.scml.codegen.lib.Aggregator;
import at.ac.tuwien.big.scml.codegen.lib.DataValue;

import vienna.component.STTrafficLights;


public class STcarsPerMinute extends Aggregator {
	private STTrafficLights sTTrafficLights;
	
	public STcarsPerMinute(Producer producer){
		super
		(
			"sTcarsPerMinute", 
			new AggregatedValue("SUM", "STRING"), 
			new GoalReferenceValue("100", "INTEGER")
		);
		sTTrafficLights = (STTrafficLights) producer;
	}
	
	public AggregatedValue getsTcarsPerMinuteAggregatedValue(){
		return this.getAggregatedValue();
	}
	
	public GoalReferenceValue sTcarsPerMinuteGoalReferenceValue(){
		return this.getGoalReferenceValue();
	}
	
	@Override
	public void aggregate(List<DataValue> values){
		this.aggregatedValue.update(values);
		System.out.println("	Aggregated Value for " + sTTrafficLights.name + " = " + this.aggregatedValue.getValue() + " with " + this.aggregatedValue.aggregator + " aggregation function");
	}
	
	public void step(){
		 this.aggregate(sTTrafficLights.collect());
	}
}
