package vienna.parameter;

import java.util.List;

import at.ac.tuwien.big.scml.codegen.lib.GoalReferenceValue;
import at.ac.tuwien.big.scml.codegen.lib.AggregatedValue;
import at.ac.tuwien.big.scml.codegen.lib.Producer;
import at.ac.tuwien.big.scml.codegen.lib.Aggregator;
import at.ac.tuwien.big.scml.codegen.lib.DataValue;

import vienna.component.GETUKarlsplatz;


public class GELux extends Aggregator {
	private GETUKarlsplatz gETUKarlsplatz;
	
	public GELux(Producer producer){
		super
		(
			"gELux", 
			new AggregatedValue("MAX", "INTEGER"), 
			new GoalReferenceValue("11", "INTEGER")
		);
		gETUKarlsplatz = (GETUKarlsplatz) producer;
	}
	
	public AggregatedValue getgELuxAggregatedValue(){
		return this.getAggregatedValue();
	}
	
	public GoalReferenceValue gELuxGoalReferenceValue(){
		return this.getGoalReferenceValue();
	}
	
	@Override
	public void aggregate(List<DataValue> values){
		this.aggregatedValue.update(values);
		System.out.println("	Aggregated Value for " + gETUKarlsplatz.name + " = " + this.aggregatedValue.getValue() + " with " + this.aggregatedValue.aggregator + " aggregation function");
	}
	
	public void step(){
		 this.aggregate(gETUKarlsplatz.collect());
	}
}
