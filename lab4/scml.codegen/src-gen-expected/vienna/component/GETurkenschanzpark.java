package vienna.component;
	
import java.util.List;


import at.ac.tuwien.big.scml.codegen.lib.DataSource;
import at.ac.tuwien.big.scml.codegen.lib.DataValue;
import at.ac.tuwien.big.scml.codegen.lib.Producer;
import at.ac.tuwien.big.scml.codegen.lib.DataValueStack;


import vienna.parameter.GECo2Content;


public class GETurkenschanzpark extends Producer {

	private DataValueStack stack;
	
	public GECo2Content parameter;
	
	
	public GETurkenschanzpark(String name, DataSource<String> dataSource) {
		super(name, dataSource);
		parameter = new GECo2Content(this);
		stack = new DataValueStack();
	}
	
	@Override
	public DataValue produce(){
		if(this.dataSource.getQueueLength() != 0) {
    		String data = dataSource.next();
    		DataValue dataValue = new DataValue(data);
    		stack.add(dataValue);
    		return dataValue;
    	}
    	System.out.println("Currently, no new values present for component: " + name);
    	return null;
	}
	
	
	public List<DataValue> collect(){
		return stack.getUnCollectedDataValues();
	}
	
	public String toString(){
		return name;
	}
	

public void printEnvironmentalComponentGETurkenschanzparkInfo(){
	System.out.println("🌳 Name ==> " + "GE Turkenschanzpark");
	System.out.println("Responsible body ==> Stadt Wien ");
	System.out.println("Area = 1.5 sq km");
	System.out.println("Number of sensors @ 25 ");
}
	}
