package vienna.component;
	
import java.util.List;


import at.ac.tuwien.big.scml.codegen.lib.DataSource;
import at.ac.tuwien.big.scml.codegen.lib.DataValue;
import at.ac.tuwien.big.scml.codegen.lib.Producer;
import at.ac.tuwien.big.scml.codegen.lib.DataValueStack;


import vienna.parameter.GELux;


public class GETUKarlsplatz extends Producer {

	private DataValueStack stack;
	
	public GELux parameter;
	
	
	public GETUKarlsplatz(String name, DataSource<String> dataSource) {
		super(name, dataSource);
		parameter = new GELux(this);
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
	

public void printBuildingComponentGETUKarlsplatzInfo(){
	System.out.println("🏢 Building @ " + "GE TU Karlsplatz");
	System.out.println("Est. @ 1648 ");
	System.out.println("Number of rooms. @ 56 ");
}
	}
