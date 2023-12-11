package vienna.component;
	
import java.util.List;


import at.ac.tuwien.big.scml.codegen.lib.DataSource;
import at.ac.tuwien.big.scml.codegen.lib.DataValue;
import at.ac.tuwien.big.scml.codegen.lib.Producer;
import at.ac.tuwien.big.scml.codegen.lib.DataValueStack;


import vienna.parameter.STenergyConsumedSb;


public class STWienerLinienStrassenbahn extends Producer {

	private DataValueStack stack;
	
	public STenergyConsumedSb parameter;
	
	
	public STWienerLinienStrassenbahn(String name, DataSource<String> dataSource) {
		super(name, dataSource);
		parameter = new STenergyConsumedSb(this);
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
	

public void printTransportationComponentSTWienerLinienStrassenbahnInfo(){
	System.out.println("🚂 Transportation Component ==> " + "ST Wiener Linien Strassenbahn");
	System.out.println("Number of employees ==> 200 ");
	System.out.println("Number of vehicles @ 1200 ");
	System.out.println("Number of control room @ 5 ");
}
	}
