package com.learning.designpatterns.abstractfactory;

public class PermanentWorker extends Employee{
	private double monthlysalary;
	public PermanentWorker(int id, String name, double monthlysalary) {
		super(id, name);
		this.monthlysalary=monthlysalary;
	}
	public PermanentWorker() {
	}
	public double getMonthlysalary() {
		return monthlysalary;
	}
	public void setMonthlysalary(double monthlysalary) {
		this.monthlysalary = monthlysalary;
	}
	@Override
	public String toString() {
		return "PermanentWorker [monthlysalary=" + monthlysalary + ", getId()=" + getId() + ", getName()=" + getName()
				+ "]";
	}

	
}
