package cacheCar;

import java.util.HashMap;
import java.util.Map;

public class VehicleCache {

	private static Map<String,Vehicle> vehicleMap = new HashMap<>();
	
	public static void loadCache() {
		Accessory accessory1 = new Accessory(1234, 99.99);
		Vehicle car = new Car("abc123", 101023.2323, accessory1);
		vehicleMap.put("Car", car);
		
		Accessory accessory2 = new Accessory(4321, 9.99);
		Vehicle bike = new Bike("abc124", 10193.2323, accessory2);
		vehicleMap.put("Bike", bike);
	}
	public static Vehicle getVehcileFromCache(String id) throws CloneNotSupportedException {
		return vehicleMap.get(id).clone();
	}
}
