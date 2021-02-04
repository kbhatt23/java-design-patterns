package com.learning.designpatterns.bridge.self;

public class RedCar extends Car{

	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Coloring Car to red");
	}
}
