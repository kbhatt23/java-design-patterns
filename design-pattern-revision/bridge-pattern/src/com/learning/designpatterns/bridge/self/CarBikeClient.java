package com.learning.designpatterns.bridge.self;

public class CarBikeClient {
	public static void main(String[] args) {
		Vehicle redCar = new RedCar();
		Vehicle blackCar = new BlackCar();
		Vehicle redBike = new RedBike();
		Vehicle blackBike = new BlackBike();
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
