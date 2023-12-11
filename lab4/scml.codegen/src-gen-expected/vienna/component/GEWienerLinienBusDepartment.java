package vienna.component;
	
import java.util.List;


import at.ac.tuwien.big.scml.codegen.lib.DataSource;
import at.ac.tuwien.big.scml.codegen.lib.DataValue;
import at.ac.tuwien.big.scml.codegen.lib.Producer;
import at.ac.tuwien.big.scml.codegen.lib.DataValueStack;


import vienna.parameter.STtransportEnergyConsumption;


public class GEWienerLinienBusDepartment extends Producer {

	private DataValueStack stack;
	
	public STtransportEnergyConsumption parameter;
	
	
	public GEWienerLinienBusDepartment(String name, DataSource<String> dataSource) {
		super(name, dataSource);
		parameter = new STtransportEnergyConsumption(this);
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
	

public void printTransportationComponentGEWienerLinienBusDepartmentInfo(){
	System.out.println("🚂 Transportation Component ==> " + "GE Wiener Linien Bus Department");
	System.out.println("Number of employees ==> 200 ");
	System.out.println("Number of vehicles @ 1200 ");
	System.out.println("Number of control room @ 5 ");
}
	}
