package com.learning.designpatterns.prototype;

public class InnerBulkyObject {

	// primitve
	private int innerIntProperty;

	// immutable object
	private String innerStringProperty;

	public InnerBulkyObject(int innerIntProperty, String innerStringProperty) {
		super();
		this.innerIntProperty = innerIntProperty;
		this.innerStringProperty = innerStringProperty;
	}

	public int getInnerIntProperty() {
		return innerIntProperty;
	}

	public void setInnerIntProperty(int innerIntProperty) {
		this.innerIntProperty = innerIntProperty;
	}

	public String getInnerStringProperty() {
		return innerStringProperty;
	}

	public void setInnerStringProperty(String innerStringProperty) {
		this.innerStringProperty = innerStringProperty;
	}
	
	
}
