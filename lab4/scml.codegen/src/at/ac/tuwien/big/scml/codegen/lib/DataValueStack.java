package at.ac.tuwien.big.scml.codegen.lib;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;


public class DataValueStack {
	
	private LinkedList<DataValue> stack;
	public DataValueStack() {
		stack = new LinkedList<DataValue>();
	}
	
	public void add(DataValue v) {
		stack.push(v);
	}
	
	public List<DataValue> getUnCollectedDataValues() {
		
		List<DataValue> values = new ArrayList<DataValue>();
		while(!this.stack.isEmpty()) {
			DataValue v = this.stack.pop();
			if(v.collected) {
				break;
			}
			values.add(v.collect());
		}
		values.forEach(v -> this.stack.push(v));
		
		System.out.println("	Newly Collected Values");
		System.out.println("	" + values.stream()
				.map(DataValue::getValue)
                .map(Object::toString)
                .collect(Collectors.joining(", ")));
		
		return values;
	}
}