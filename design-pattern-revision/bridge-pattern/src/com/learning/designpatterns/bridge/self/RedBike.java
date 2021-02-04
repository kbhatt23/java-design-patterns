package com.learning.designpatterns.bridge.self;

public class RedBike extends Bike{

	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Coloring Bike to red");
	}
}
