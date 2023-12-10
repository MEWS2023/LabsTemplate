package vienna.parameter;

import java.util.List;

import at.ac.tuwien.big.scml.codegen.lib.GoalReferenceValue;
import at.ac.tuwien.big.scml.codegen.lib.AggregatedValue;
import at.ac.tuwien.big.scml.codegen.lib.Producer;
import at.ac.tuwien.big.scml.codegen.lib.Aggregator;
import at.ac.tuwien.big.scml.codegen.lib.DataValue;

import vienna.component.STWienerLinienUbahn;


public class STenergyConsumedUb extends Aggregator {
	private STWienerLinienUbahn sTWienerLinienUbahn;
	
	public STenergyConsumedUb(Producer producer){
		super
		(
			"sTenergyConsumedUb", 
			new AggregatedValue("AVG", "STRING"), 
			new GoalReferenceValue("50", "INTEGER")
		);
		sTWienerLinienUbahn = (STWienerLinienUbahn) producer;
	}
	
	public AggregatedValue getsTenergyConsumedUbAggregatedValue(){
		return this.getAggregatedValue();
	}
	
	public GoalReferenceValue sTenergyConsumedUbGoalReferenceValue(){
		return this.getGoalReferenceValue();
	}
	
	@Override
	public void aggregate(List<DataValue> values){
		this.aggregatedValue.update(values);
		System.out.println("	Aggregated Value for " + sTWienerLinienUbahn.name + " = " + this.aggregatedValue.getValue() + " with " + this.aggregatedValue.aggregator + " aggregation function");
	}
	
	public void step(){
		 this.aggregate(sTWienerLinienUbahn.collect());
	}
}
