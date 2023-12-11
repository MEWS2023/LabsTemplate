package vienna.parameter;

import java.util.List;

import at.ac.tuwien.big.scml.codegen.lib.GoalReferenceValue;
import at.ac.tuwien.big.scml.codegen.lib.AggregatedValue;
import at.ac.tuwien.big.scml.codegen.lib.Producer;
import at.ac.tuwien.big.scml.codegen.lib.Aggregator;
import at.ac.tuwien.big.scml.codegen.lib.DataValue;

import vienna.component.STWienerLinienStrassenbahn;


public class STenergyConsumedSb extends Aggregator {
	private STWienerLinienStrassenbahn sTWienerLinienStrassenbahn;
	
	public STenergyConsumedSb(Producer producer){
		super
		(
			"sTenergyConsumedSb", 
			new AggregatedValue("AVG", "STRING"), 
			new GoalReferenceValue("30", "INTEGER")
		);
		sTWienerLinienStrassenbahn = (STWienerLinienStrassenbahn) producer;
	}
	
	public AggregatedValue getsTenergyConsumedSbAggregatedValue(){
		return this.getAggregatedValue();
	}
	
	public GoalReferenceValue sTenergyConsumedSbGoalReferenceValue(){
		return this.getGoalReferenceValue();
	}
	
	@Override
	public void aggregate(List<DataValue> values){
		this.aggregatedValue.update(values);
		System.out.println("	Aggregated Value for " + sTWienerLinienStrassenbahn.name + " = " + this.aggregatedValue.getValue() + " with " + this.aggregatedValue.aggregator + " aggregation function");
	}
	
	public void step(){
		 this.aggregate(sTWienerLinienStrassenbahn.collect());
	}
}
