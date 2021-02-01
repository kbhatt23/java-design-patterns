package com.learning.designpatterns.abstractfactory;

public class Marathon extends Race {

	private double distanceInMiles;

	public Marathon(double distanceInMiles) {
		super();
		this.distanceInMiles = distanceInMiles;
	}

	public Marathon() {
	}

	public double getDistanceInMiles() {
		return distanceInMiles;
	}

	public void setDistanceInMiles(double distanceInMiles) {
		this.distanceInMiles = distanceInMiles;
	}

	@Override
	public String toString() {
		return "Marathon [distanceInMiles=" + distanceInMiles + ", getId()=" + getId() + ", getName()=" + getName()
				+ "]";
	}

}
