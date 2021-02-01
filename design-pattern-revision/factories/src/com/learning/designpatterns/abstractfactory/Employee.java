package com.learning.designpatterns.abstractfactory;

public abstract class Employee implements FactoryDiscoverableObject{

	private int id;
	
	private String name;
	
	public Employee(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	public Employee() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
