package com.learning.designpatterns.bridge.self;

public class CarBikeClientWithBridge {
	public static void main(String[] args) {
		//no need of so much verbose , in any case of change in interface no change in implenetor technique
		//		Vehicle redCar = new RedCar();
//		Vehicle blackCar = new BlackCar();
//		Vehicle redBike = new RedBike();
//		Vehicle blackBike = new BlackBike();
		Vehicle redCar = new CarWithBridge(VehicleColor.RED);
		Vehicle blackCar = new CarWithBridge(VehicleColor.BLACK);
		Vehicle redBike = new BikeWithBridge(VehicleColor.RED);
		Vehicle blackBike= new BikeWithBridge(VehicleColor.BLACK);
		assembleVehicle(redCar);
		assembleVehicle(blackCar);
		assembleVehicle(redBike);
		assembleVehicle(blackBike);
	}

	public static void assembleVehicle(Vehicle vehicle) {
		vehicle.assemble();
		System.out.println("=============");
	}
}
