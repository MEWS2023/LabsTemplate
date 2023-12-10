package at.ac.tuwien.big.scml.codegen.lib;


public abstract class Producer {
    public String name;
    protected DataSource<String> dataSource;
    
    

    public Producer(String name, DataSource<String> dataSource) {
    	this.name = name;
    	this.dataSource = dataSource;
    }
    
    abstract public DataValue produce();
}

