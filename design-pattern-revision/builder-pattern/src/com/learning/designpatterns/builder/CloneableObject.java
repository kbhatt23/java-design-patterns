package com.learning.designpatterns.builder;

public class CloneableObject implements Cloneable{

	private int id;
	private double salary;
	
	//immutable class
	private Integer complexEntry;

	//immutable class
	private String name;
	
	//a mutable class -> shallow copy/clone will keep this as same instance in cloned copy
	private AnotherObject anotherObject;

	public CloneableObject(int id, double salary, Integer complexEntry, String name, AnotherObject anotherObject) {
		super();
		this.id = id;
		this.salary = salary;
		this.complexEntry = complexEntry;
		this.name = name;
		this.anotherObject = anotherObject;
	}

	public CloneableObject() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Integer getComplexEntry() {
		return complexEntry;
	}

	public void setComplexEntry(Integer complexEntry) {
		this.complexEntry = complexEntry;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AnotherObject getAnotherObject() {
		return anotherObject;
	}

	public void setAnotherObject(AnotherObject anotherObject) {
		this.anotherObject = anotherObject;
	}

	@Override
	public String toString() {
		return "CloneableObject [id=" + id + ", salary=" + salary + ", complexEntry=" + complexEntry + ", name=" + name
				+ ", anotherObject=" + anotherObject + "]";
	}
	
	//overriding allows restriction of super methods
	//object class method is protected
	@Override
	public CloneableObject clone() throws CloneNotSupportedException {
		return (CloneableObject)super.clone();
	}
	
}
