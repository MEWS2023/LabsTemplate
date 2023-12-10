package at.ac.tuwien.big.scml.codegen.lib;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;


public class AggregatedValue extends Data {
	
	public AggregatorType aggregator;
    public String aggregatedTime;
    
    public enum AggregatorType {
        SUM, MAX, MIN, AVG
    }

    public AggregatedValue(String aggregator, String type) {
        super("-1", type);
        this.setAggregator(aggregator);
    }
    
    private void setAggregator(String aggregator) {
    	switch (aggregator) {
    		case "SUM":
    			this.aggregator = AggregatorType.SUM;
    			break;
    		case "MAX":
    			this.aggregator = AggregatorType.MAX;
    			break;
    			
    		case "MIN":
    			this.aggregator = AggregatorType.MIN;
    			break;
    			
    		case "AVG":
    			this.aggregator = AggregatorType.AVG;
    	
    	}
    }
    
    public void setAggregatedTime() {
    	aggregatedTime = getCurrentTimeFormatted();
    }
    
    public void update(List<DataValue> dataValues) {
        if (dataValues == null || dataValues.isEmpty()) {
            System.out.println("Cannot aggregate empty values.");
            return;
        }

        double result = 0;
        
        List<Number> values = dataValues.stream()
        		.map(obj -> Double.valueOf(obj.getValue()))
                .collect(Collectors.toList());

        
        switch (this.aggregator) {
            case SUM:
                result = values.stream().mapToDouble(Number::doubleValue).sum();
                break;
            case MAX:
                result = values.stream().mapToDouble(Number::doubleValue).max().orElse(0);
                break;
            case MIN:
                result = values.stream().mapToDouble(Number::doubleValue).min().orElse(0);
                break;
            case AVG:
                result = values.stream().mapToDouble(Number::doubleValue).average().orElse(0);
                break;
            default:
                System.out.println("Unsupported aggregator type.");
                return;
        }

        value = String.valueOf(result);
        setAggregatedTime();
    }
    
    private String getCurrentTimeFormatted() {
        OffsetDateTime now = OffsetDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        return now.format(formatter);
    }
    
    public String toString(){
		return value;
	}
}