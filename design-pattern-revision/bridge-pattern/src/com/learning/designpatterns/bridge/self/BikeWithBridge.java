package com.learning.designpatterns.bridge.self;

public class BikeWithBridge implements Vehicle{//decouping abstractiona and implentor
	//even if color changes it won afffect vehicle
	//even if vehicle interface changes it wont affect behicle color
	private VehicleColor color;
	public BikeWithBridge(VehicleColor color) {
		this.color=color;
	}
	@Override
	public void assemble() {
		System.out.println("Assembling Bike");
		//no need to be extendsed by child class
		System.out.println("Coloring bike with color "+color.toString());
	}

}
