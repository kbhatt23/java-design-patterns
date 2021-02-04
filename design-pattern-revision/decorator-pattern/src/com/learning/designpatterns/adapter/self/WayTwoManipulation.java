package com.learning.designpatterns.adapter.self;

public class WayTwoManipulation  extends ManipulationDecorator{
	public WayTwoManipulation(Manipulation manipulation) {
		super(manipulation);
	}

	public void manipulate() {
		//getManipulation().manipulate();
		manipulation.manipulate();
		System.out.println("WayTwoManipulation class manipulation starts");
	}
}
