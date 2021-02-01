package com.learning.designpatterns.builder;

public class CloneableTestCliet {
	public static void main(String[] args) throws CloneNotSupportedException {
		AnotherObject obj1 = new AnotherObject(11, "another madhav", 99); 
				
		CloneableObject obj = new CloneableObject(1, 10.10, 23, "madhav", obj1);
		
		CloneableObject clonedObj = obj.clone();
		System.out.println("original object "+obj);
		System.out.println("cloned obj "+clonedObj);
		
		System.out.println("lets modify the cloned object");
		
		//all below are either primitive or mutable object and hence main object wont see the effect
		clonedObj.setComplexEntry(101);
		clonedObj.setId(101);
		clonedObj.setName("modified madhav");
		clonedObj.setSalary(-1);
		
		//mutable objects/objects are shared , but on modification immutable objects are created newly but not so for mutable objects
		clonedObj.getAnotherObject().setAnotherId(1000);
		clonedObj.getAnotherObject().setAnotherName("another updated amdhav");
		
		System.out.println("original object "+obj);
		System.out.println("cloned obj "+clonedObj);
		
	}
}
