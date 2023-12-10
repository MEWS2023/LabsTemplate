package at.ac.tuwien.big.scml.codegen.lib;


public abstract class Indicator {
    public String name;
    public String status;
    public Aggregator aggregator;
    
    public Indicator(String name) {
    	this.name = name;
    	this.status = "GOOD";
    }
    
    public void setAggregator(Aggregator aggregator) {
    	this.aggregator = aggregator;
    }

	abstract public void aggregate();
	abstract public void updateStatus(AggregatedValue aggregatedValue, GoalReferenceValue goalReferenceValue);
}
