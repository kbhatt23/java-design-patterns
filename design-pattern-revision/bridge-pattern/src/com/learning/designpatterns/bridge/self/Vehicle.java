package com.learning.designpatterns.bridge.self;

public interface Vehicle {

	//suppose we change the contract, without bridge we would be overridign this in all the subcalasses
	//meaning if usiong interface it is better to extend less classes and prefer bridge
	public void assemble();
	
	//suppose we increasr the method
	//public void start();
	
}
