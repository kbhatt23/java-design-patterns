package vehicleExample;

public class VehicleClient {
public static void main(String[] args) {
	//in future these can change to any level
	//decoupling is already done
	WorkShop produce = new Produce();
	WorkShop assemble = new Assemble();
	WorkShop selling = new Selling();
	//vehiucle can also be extended to any level
	Vehicle car = new Car(produce, assemble, selling);
	car.process();
	
	Vehicle bike = new Bike(produce, assemble, selling);
	bike.process();
	
	Vehicle truck = new Truck(produce, assemble, selling);
	truck.process();
}
}
