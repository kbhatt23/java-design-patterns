package com.learning.designpatterns.adapter.self;

public class WayOneManipulation  extends ManipulationDecorator {
	public WayOneManipulation(Manipulation manipulation) {
		super(manipulation);
	}

	public void manipulate() {
		//getManipulation().manipulate();
		manipulation.manipulate();
		System.out.println("WayOneManipulation class manipulation starts");
	}
}
