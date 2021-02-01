package com.learning.designpatterns.abstractfactory;

public class DailyWorker extends Employee{

	private double dailyWage;
	
	public DailyWorker(int id, String name, double dailyWage) {
		super(id, name);
		this.dailyWage=dailyWage;
	}
	
	public DailyWorker() {
		
	}

	public double getDailyWage() {
		return dailyWage;
	}

	public void setDailyWage(double dailyWage) {
		this.dailyWage = dailyWage;
	}

	@Override
	public String toString() {
		return "DailyWorker [dailyWage=" + dailyWage + ", getId()=" + getId() + ", getName()=" + getName() + "]";
	}
	
	

}
