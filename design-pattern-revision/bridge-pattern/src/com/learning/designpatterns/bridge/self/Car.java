package com.learning.designpatterns.bridge.self;

public class Car implements Vehicle{

	@Override
	public void assemble() {
		System.out.println("Assembling car");
	}

}
