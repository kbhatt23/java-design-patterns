package com.learning.oopscocepts.basics.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class NonSerialzableChildClass extends SerializableSuperclass2 {

	public int getChildProperty() {
		return childProperty;
	}
	public void setChildProperty(int childProperty) {
		this.childProperty = childProperty;
	}
	private static final long serialVersionUID = 1L;
	private int childProperty;
	public NonSerialzableChildClass(int superProperty, int childProperty) {
		super(superProperty);
		this.childProperty=childProperty;
	}
	@Override
	public String toString() {
		return "SerialzableChildClass [childProperty=" + childProperty + ", getSuperProperty()=" + getSuperProperty()
				+ "]";
	}
	
	
	//if we do nto want serialzation to happen here
	private void writeObject(ObjectOutputStream os) {
		throw new UnsupportedOperationException("we do nto support serialzation");
	}
		private void readObject(ObjectInputStream is) {
			throw new UnsupportedOperationException("we do nto support deserialzation");
		}
	
	
}
