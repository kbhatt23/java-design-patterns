package com.learning.oopscocepts.basics.serialization;

import java.io.Serializable;

public class NonSerialzableClass /* implements Serializable */{

	private static final long serialVersionUID = -1544154162037671080L;

	//primitive property
	private int innerIntProperty;
	
	//already serialzable 
	private String innerStringProperty;

	public NonSerialzableClass(int innerIntProperty, String innerStringProperty) {
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

	@Override
	public String toString() {
		return "NonSerialzableClass [innerIntProperty=" + innerIntProperty + ", innerStringProperty="
				+ innerStringProperty + "]";
	}
	
	
}
