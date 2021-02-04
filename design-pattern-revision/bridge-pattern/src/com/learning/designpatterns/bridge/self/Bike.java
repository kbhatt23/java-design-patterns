package com.learning.designpatterns.bridge.self;

public class Bike implements Vehicle{
	@Override
	public void assemble() {
		System.out.println("Assembling Bike");
	}

}
