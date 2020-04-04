package cacheCar;

public class VehicleCacheClient {

	public static void main(String[] args) throws CloneNotSupportedException {
		VehicleCache.loadCache();
		
		Vehicle bike = VehicleCache.getVehcileFromCache("Bike");
		bike.printPrice();
		System.out.println(bike);
		
		Vehicle bike1 = new Bike("av2323", 12323.2323, new Accessory(21, 2323.233));
		
		Vehicle bike2 = bike1.clone();
		bike2.setId("abc3434");
		bike2.setPrice(2323.2323);
		bike2.getAccessory().setBarcode(9999999);
		System.out.println(bike1);
		System.out.println(bike2);
	}

}
