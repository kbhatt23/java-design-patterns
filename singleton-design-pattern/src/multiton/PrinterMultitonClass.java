package multiton;

import java.util.HashMap;

//a multiton class supports a single class per subsystem
//like a printer can be one on each floor of office
public class PrinterMultitonClass {

	//in mono state there can be more tahn object but have same property so constructor was public
	//here we need private
	
	private PrinterMultitonClass() {
		
	}
	//a static varioable has only one copy
	//no need of synchronizedhashmap as it is static and has one copy so multiple thread can not have theri independet instances of map
	private static HashMap<Floor,PrinterMultitonClass > printerEntries = new HashMap<Floor, PrinterMultitonClass>();
	
	public static PrinterMultitonClass get(Floor floor) {
		if(printerEntries.containsKey(floor)) {
			return printerEntries.get(floor);
		}
		PrinterMultitonClass obj = new PrinterMultitonClass();
		printerEntries.put(floor,obj);
		return obj;
		
	}
}


