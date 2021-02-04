package com.learning.designpatterns.bridge.self;

public class CarWithBridge implements Vehicle{

	private VehicleColor color;
	public CarWithBridge(VehicleColor color) {
		this.color=color;
	}
	@Override
	public void assemble() {
		System.out.println("Assembling car");
		//no need to be extendsed by child class
		System.out.println("Coloring car with color "+color.toString());
	}

}
