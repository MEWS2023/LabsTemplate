package vienna.kpi;

import java.util.List;
import java.util.ArrayList;

import at.ac.tuwien.big.scml.codegen.lib.GoalReferenceValue;
import at.ac.tuwien.big.scml.codegen.lib.AggregatedValue;
import at.ac.tuwien.big.scml.codegen.lib.Indicator;
import at.ac.tuwien.big.scml.codegen.lib.Util;

import vienna.parameter.STenergyConsumedCR;


public class ControlRoomEnergyConsumedIndicator extends Indicator {
	private List<String> lastCalculations;
	
	
	public ControlRoomEnergyConsumedIndicator(){
		super("ControlRoomEnergyConsumedIndicator");
		status = "GOOD";
		lastCalculations = new ArrayList<String>();
	}
	
	public void setParameter(STenergyConsumedCR aggregator){
		this.setAggregator(aggregator);
	}
	
	@Override
	public void aggregate(){
		aggregator.step();
		AggregatedValue aggregatedValue = aggregator.getAggregatedValue();
		GoalReferenceValue goalReferenceValue = aggregator.getGoalReferenceValue();
		System.out.println("---- Updating status ----"); 
		updateStatus(aggregatedValue, goalReferenceValue);
		
		String lastCalculation = aggregatedValue.aggregatedTime;
		System.out.println("🕛 Adding Last Calculation Time: " + lastCalculation + "\n");
		lastCalculations.add(lastCalculation);
	}
	
	@Override
	public void updateStatus(AggregatedValue aggregatedValue, GoalReferenceValue goalReferenceValue){
		Double grv = Double.parseDouble(goalReferenceValue.getValue());
		Double av = Double.parseDouble(aggregatedValue.getValue());
		
		System.out.println("	Aggregated Value for " + av);
		System.out.println("	Goal Reference Value for " + grv);
		status = Util.getStatus(grv, av);
		
		if (status == "GOOD") {
			System.out.println("---- Setting status to " + status + " 🟢 ----\n");
		} else if (status == "WARN") {
			System.out.println("---- Setting status to " + status + " 🟠 ----\n");
		} else {
			System.out.println("---- Setting status to " + status + " 🔴 ----\n");
		}
	}
}
