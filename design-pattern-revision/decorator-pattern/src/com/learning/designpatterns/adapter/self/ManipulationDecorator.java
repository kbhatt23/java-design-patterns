package com.learning.designpatterns.adapter.self;
//any class that can be decorated will extend this class
public  abstract class ManipulationDecorator implements Manipulation{

	/* private */ protected Manipulation manipulation;
	
	
	public ManipulationDecorator(Manipulation manipulation) {
		this.manipulation = manipulation;
	}


//	public Manipulation getManipulation() {
//		return manipulation;
//	}
//
//
//	public void setManipulation(Manipulation manipulation) {
//		this.manipulation = manipulation;
//	}



}
