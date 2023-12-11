package vienna.parameter;

import java.util.List;

import at.ac.tuwien.big.scml.codegen.lib.GoalReferenceValue;
import at.ac.tuwien.big.scml.codegen.lib.AggregatedValue;
import at.ac.tuwien.big.scml.codegen.lib.Producer;
import at.ac.tuwien.big.scml.codegen.lib.Aggregator;
import at.ac.tuwien.big.scml.codegen.lib.DataValue;

import vienna.component.STWienerLinien;


public class STenergyConsumedWienerLinien extends Aggregator {
	private STWienerLinien sTWienerLinien;
	
	public STenergyConsumedWienerLinien(Producer producer){
		super
		(
			"sTenergyConsumedWienerLinien", 
			new AggregatedValue("SUM", "STRING"), 
			new GoalReferenceValue("100", "INTEGER")
		);
		sTWienerLinien = (STWienerLinien) producer;
	}
	
	public AggregatedValue getsTenergyConsumedWienerLinienAggregatedValue(){
		return this.getAggregatedValue();
	}
	
	public GoalReferenceValue sTenergyConsumedWienerLinienGoalReferenceValue(){
		return this.getGoalReferenceValue();
	}
	
	@Override
	public void aggregate(List<DataValue> values){
		this.aggregatedValue.update(values);
		System.out.println("	Aggregated Value for " + sTWienerLinien.name + " = " + this.aggregatedValue.getValue() + " with " + this.aggregatedValue.aggregator + " aggregation function");
	}
	
	public void step(){
		 this.aggregate(sTWienerLinien.collect());
	}
}
