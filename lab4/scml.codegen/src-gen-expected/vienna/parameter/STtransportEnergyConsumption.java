package vienna.parameter;

import java.util.List;

import at.ac.tuwien.big.scml.codegen.lib.GoalReferenceValue;
import at.ac.tuwien.big.scml.codegen.lib.AggregatedValue;
import at.ac.tuwien.big.scml.codegen.lib.Producer;
import at.ac.tuwien.big.scml.codegen.lib.Aggregator;
import at.ac.tuwien.big.scml.codegen.lib.DataValue;

import vienna.component.GEWienerLinienBusDepartment;


public class STtransportEnergyConsumption extends Aggregator {
	private GEWienerLinienBusDepartment gEWienerLinienBusDepartment;
	
	public STtransportEnergyConsumption(Producer producer){
		super
		(
			"sTtransportEnergyConsumption", 
			new AggregatedValue("AVG", "INTEGER"), 
			new GoalReferenceValue("30", "INTEGER")
		);
		gEWienerLinienBusDepartment = (GEWienerLinienBusDepartment) producer;
	}
	
	public AggregatedValue getsTtransportEnergyConsumptionAggregatedValue(){
		return this.getAggregatedValue();
	}
	
	public GoalReferenceValue sTtransportEnergyConsumptionGoalReferenceValue(){
		return this.getGoalReferenceValue();
	}
	
	@Override
	public void aggregate(List<DataValue> values){
		this.aggregatedValue.update(values);
		System.out.println("	Aggregated Value for " + gEWienerLinienBusDepartment.name + " = " + this.aggregatedValue.getValue() + " with " + this.aggregatedValue.aggregator + " aggregation function");
	}
	
	public void step(){
		 this.aggregate(gEWienerLinienBusDepartment.collect());
	}
}
