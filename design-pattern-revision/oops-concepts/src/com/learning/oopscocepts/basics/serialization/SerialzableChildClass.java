package com.learning.oopscocepts.basics.serialization;

import java.io.Serializable;

public class SerialzableChildClass extends SerializableSuperclass implements Serializable{

	public int getChildProperty() {
		return childProperty;
	}
	public void setChildProperty(int childProperty) {
		this.childProperty = childProperty;
	}
	private static final long serialVersionUID = 1L;
	private int childProperty;
	public SerialzableChildClass(int superProperty, int childProperty) {
		super(superProperty);
		this.childProperty=childProperty;
	}
	@Override
	public String toString() {
		return "SerialzableChildClass [childProperty=" + childProperty + ", getSuperProperty()=" + getSuperProperty()
				+ "]";
	}
	
	
	
}
