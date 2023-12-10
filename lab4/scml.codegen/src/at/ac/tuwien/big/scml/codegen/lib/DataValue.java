package at.ac.tuwien.big.scml.codegen.lib;


import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;


public class DataValue extends Data {
    public boolean collected;
    public String collectedTime;
    public String producedTime;

    public DataValue(String value) {
    	super(value, value.contains(".")? "FLOAT": "INT");
        producedTime = getCurrentTimeFormatted();
        collected = false;
    }
    
    public DataValue collect() {
    	collected = true;
    	collectedTime = getCurrentTimeFormatted();
    	return this;
    }
    
    private String getCurrentTimeFormatted() {
        OffsetDateTime now = OffsetDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        return now.format(formatter);
    }
    
}
