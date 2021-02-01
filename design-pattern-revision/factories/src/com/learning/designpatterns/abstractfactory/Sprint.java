package com.learning.designpatterns.abstractfactory;

public class Sprint extends Race {

	private double maxSpeed;

	public Sprint(double maxSpeed) {
		super();
		this.maxSpeed = maxSpeed;
	}

	public Sprint() {
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Sprint [maxSpeed=" + maxSpeed + ", getId()=" + getId() + ", getName()=" + getName() + "]";
	}


}
