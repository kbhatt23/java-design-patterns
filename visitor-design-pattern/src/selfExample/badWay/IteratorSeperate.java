package selfExample.badWay;

import java.util.ArrayList;
import java.util.List;

public class IteratorSeperate {
public static void main(String[] args) {
	List<Object> allItems  = new ArrayList<Object>();
	
	allItems.add(new Item1());
	allItems.add(new Item2());
	allItems.add(new Item3());
	allItems.add(new Item4());
	
	for(Object entry : allItems) {
		//reducing flexibility
		//as newer modifications will force existing class to be modified
		if(entry instanceof Item1) {
			//type casting manually
			//all cases will have different method to execute
			((Item1)entry).printItem1();
		}
		else if(entry instanceof Item2) {
			((Item2)entry).printItem2();
		}
		else if(entry instanceof Item3) {
			((Item3)entry).printItem3();
		}
		else if(entry instanceof Item4) {
			
		}((Item4)entry).printItem4();
		
	}
}
}
