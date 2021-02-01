package com.learning.designpatterns.abstractfactory;

public abstract class Race implements FactoryDiscoverableObject{

	private int id;

	private String name;

	public Race() {

	}

	public Race(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
