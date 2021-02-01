package com.learning.designpatterns.objectpool.self;

//representing sample reusable interface
//any class that is heavy object and memory intensive must implement this to represent reusable in pool
public interface Reusable {

	//can have any kind of method
	public void runTask();
	
	//assuming only one state exists
	public void updateState(int id);
		
}
