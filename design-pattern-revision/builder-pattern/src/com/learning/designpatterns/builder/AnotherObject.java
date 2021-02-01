package com.learning.designpatterns.builder;

public class AnotherObject {

	private int anotherId;
	
	//immutable and hence will be shared until modified
	private String anotherName;
	
	private Integer anotherComplexItem;

	public AnotherObject(int anotherId, String anotherName, Integer anotherComplexItem) {
		this.anotherId = anotherId;
		this.anotherName = anotherName;
		this.anotherComplexItem = anotherComplexItem;
	}

	public AnotherObject() {
		super();
	}

	public int getAnotherId() {
		return anotherId;
	}

	public void setAnotherId(int anotherId) {
		this.anotherId = anotherId;
	}

	public String getAnotherName() {
		return anotherName;
	}

	public void setAnotherName(String anotherName) {
		this.anotherName = anotherName;
	}

	public Integer getAnotherComplexItem() {
		return anotherComplexItem;
	}

	public void setAnotherComplexItem(Integer anotherComplexItem) {
		this.anotherComplexItem = anotherComplexItem;
	}

	@Override
	public String toString() {
		return "AnotherObject [anotherId=" + anotherId + ", anotherName=" + anotherName + ", anotherComplexItem="
				+ anotherComplexItem + "]";
	}
	
	
	
}
