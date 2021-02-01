package com.learning.designprinciples.interfacesegregation;

import java.time.LocalDateTime;
import java.util.List;

public class OrderEntity extends Entity{
	
	private List<String> items;
	
	private String address;
	
	private LocalDateTime creationTime;
	
	private String orderState;

	public String getOrderState() {
		return orderState;
	}

	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}

	public OrderEntity(int id, List<String> items, String address, LocalDateTime creationTime,String state) {
		super(id);
		this.items = items;
		this.address = address;
		this.creationTime = creationTime;
		this.orderState=state;
	}

	public List<String> getItems() {
		return items;
	}

	public void setItems(List<String> items) {
		this.items = items;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDateTime getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(LocalDateTime creationTime) {
		this.creationTime = creationTime;
	}

	@Override
	public String toString() {
		return "OrderEntity [items=" + items + ", address=" + address + ", creationTime=" + creationTime
				+ ", orderState=" + orderState + ", getId()=" + getId() + "]";
	}
	
	
}
