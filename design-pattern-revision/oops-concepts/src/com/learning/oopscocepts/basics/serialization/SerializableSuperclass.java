package com.learning.oopscocepts.basics.serialization;

import java.io.Serializable;

public class SerializableSuperclass /* implements Serializable */{

	private static final long serialVersionUID = 1L;

	private int superProperty;

	public SerializableSuperclass(int superProperty) {
		super();
		this.superProperty = superProperty;
	}
	//in case this class is not serialzble but child class is then during serialzation if this is miggin exception occurs
	public SerializableSuperclass() {
	}

	@Override
	public String toString() {
		return "SerializableSuperclass [superProperty=" + superProperty + "]";
	}

	public int getSuperProperty() {
		return superProperty;
	}

	public void setSuperProperty(int superProperty) {
		this.superProperty = superProperty;
	}
	
	
}
