package vienna.parameter;

import java.util.List;

import at.ac.tuwien.big.scml.codegen.lib.GoalReferenceValue;
import at.ac.tuwien.big.scml.codegen.lib.AggregatedValue;
import at.ac.tuwien.big.scml.codegen.lib.Producer;
import at.ac.tuwien.big.scml.codegen.lib.Aggregator;
import at.ac.tuwien.big.scml.codegen.lib.DataValue;

import vienna.component.STWestBahnhofControlRoom;


public class STenergyConsumedCR extends Aggregator {
	private STWestBahnhofControlRoom sTWestBahnhofControlRoom;
	
	public STenergyConsumedCR(Producer producer){
		super
		(
			"sTenergyConsumedCR", 
			new AggregatedValue("SUM", "STRING"), 
			new GoalReferenceValue("800", "INTEGER")
		);
		sTWestBahnhofControlRoom = (STWestBahnhofControlRoom) producer;
	}
	
	public AggregatedValue getsTenergyConsumedCRAggregatedValue(){
		return this.getAggregatedValue();
	}
	
	public GoalReferenceValue sTenergyConsumedCRGoalReferenceValue(){
		return this.getGoalReferenceValue();
	}
	
	@Override
	public void aggregate(List<DataValue> values){
		this.aggregatedValue.update(values);
		System.out.println("	Aggregated Value for " + sTWestBahnhofControlRoom.name + " = " + this.aggregatedValue.getValue() + " with " + this.aggregatedValue.aggregator + " aggregation function");
	}
	
	public void step(){
		 this.aggregate(sTWestBahnhofControlRoom.collect());
	}
}
