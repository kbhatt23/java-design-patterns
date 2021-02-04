package com.learning.designpatterns.bridge.self;

public class BlackCar extends Car{

	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Coloring Car to black");
	}
}
