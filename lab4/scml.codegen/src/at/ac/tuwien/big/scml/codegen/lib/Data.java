package at.ac.tuwien.big.scml.codegen.lib;


public abstract class Data {
    protected String value;
    protected String type;

    public Data(String value, String type) {
        this.value = value;
        this.type = type;
    }
    public String getValue() {
    	return value;
    }
    
    public String getType() {
    	return type;
    }
}

