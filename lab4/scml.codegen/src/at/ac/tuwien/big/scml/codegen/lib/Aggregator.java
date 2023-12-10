package at.ac.tuwien.big.scml.codegen.lib;

import java.util.List;

public abstract class Aggregator {
    public String name;
    protected AggregatedValue aggregatedValue;
    protected GoalReferenceValue goalReferenceValue;

    public Aggregator(String name, AggregatedValue aggregatedValue, GoalReferenceValue goalReferenceValue) {
    	this.name = name;
    	this.aggregatedValue = aggregatedValue;
    	this.goalReferenceValue = goalReferenceValue;
    }
    
    public AggregatedValue getAggregatedValue() {
    	return aggregatedValue;
    }
    
    public GoalReferenceValue getGoalReferenceValue() {
    	return goalReferenceValue;
    }
    
    abstract public void step();

	abstract public void aggregate(List<DataValue> values);
}

