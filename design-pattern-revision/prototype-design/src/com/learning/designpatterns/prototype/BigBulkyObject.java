package com.learning.designpatterns.prototype;

//assume that the object takes a lot of time to complet ethe constructor and create object
//java suggest use simple clone method that natively copies the object contentn into anotehr object
//native method is way faster but it bypasses constructor call
//but it do shallow copy only

//cloneable is marker interface
public class BigBulkyObject implements Cloneable{

	//primitve
	private int intProperty;
	
	//immutable object
	private String stringProperty;
	
	private InnerBulkyObject innerBulkyObject;

	public BigBulkyObject(int intProperty, String stringProperty, InnerBulkyObject innerBulkyObject) {
		//force time consuming task
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.intProperty = intProperty;
		this.stringProperty = stringProperty;
		this.innerBulkyObject = innerBulkyObject;
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

	public InnerBulkyObject getInnerBulkyObject() {
		return innerBulkyObject;
	}

	public void setInnerBulkyObject(InnerBulkyObject innerBulkyObject) {
		this.innerBulkyObject = innerBulkyObject;
	}

	@Override
	public String toString() {
		return "BigBulkyObject [intProperty=" + intProperty + ", stringProperty=" + stringProperty
				+ ", innerBulkyObject=" + innerBulkyObject + "]";
	}
	
	public BigBulkyObject clone() throws CloneNotSupportedException{
		//for prototype we must do resetting the states to default
		//also if neede we have to do deep copy
		return (BigBulkyObject)super.clone();
	}
	
	
}
