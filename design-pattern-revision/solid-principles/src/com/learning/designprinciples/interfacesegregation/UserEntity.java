package com.learning.designprinciples.interfacesegregation;

public class UserEntity extends Entity {
	private String name;

	private String userAddress;

	public UserEntity(int id, String name, String userAddress) {
		super(id);
		this.name = name;
		this.userAddress = userAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	@Override
	public String toString() {
		return "UserEntity [name=" + name + ", userAddress=" + userAddress + ", getId()=" + getId() + "]";
	}
	
	

}
