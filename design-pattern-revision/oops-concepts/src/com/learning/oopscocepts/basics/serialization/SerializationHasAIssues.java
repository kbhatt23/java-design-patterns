package com.learning.oopscocepts.basics.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationHasAIssues implements Serializable{

	private static final long serialVersionUID = -5294349199847243481L;

	//primitive property
	private int intProperty;
	
	//already serialzable 
	private String stringProperty;
	
	//we make it transient as writeobnject can not serialze as class can not be made serialzble
	private transient NonSerialzableClass nonSerialzableClass;
	
	private void writeObject(ObjectOutputStream os) {
		try {
			os.defaultWriteObject();
			//writeobject wont work as class is not serializable
			//better we save them as notmal properties
			os.writeInt(nonSerialzableClass.getInnerIntProperty());
			os.writeUTF(nonSerialzableClass.getInnerStringProperty());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		private void readObject(ObjectInputStream is) {
			try {
				is.defaultReadObject();
				this.nonSerialzableClass = new NonSerialzableClass(is.readInt(), is.readUTF());
			} catch (ClassNotFoundException | IOException e) {
				e.printStackTrace();
			}
		}

	public SerializationHasAIssues(int intProperty, String stringProperty, NonSerialzableClass nonSerialzableClass) {
		super();
		this.intProperty = intProperty;
		this.stringProperty = stringProperty;
		this.nonSerialzableClass = nonSerialzableClass;
	}

	public int getIntProperty() {
		return intProperty;
	}

	public void setIntProperty(int intProperty) {
		this.intProperty = intProperty;
	}

	public String getStringProperty() {
		return stringProperty;
	}

	public void setStringProperty(String stringProperty) {
		this.stringProperty = stringProperty;
	}

	public NonSerialzableClass getNonSerialzableClass() {
		return nonSerialzableClass;
	}

	public void setNonSerialzableClass(NonSerialzableClass nonSerialzableClass) {
		this.nonSerialzableClass = nonSerialzableClass;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "SerializationHasAIssues [intProperty=" + intProperty + ", stringProperty=" + stringProperty
				+ ", nonSerialzableClass=" + nonSerialzableClass + "]";
	}
	
	
	
}
