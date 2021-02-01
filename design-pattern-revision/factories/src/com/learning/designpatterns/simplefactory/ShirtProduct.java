package com.learning.designpatterns.simplefactory;

public class ShirtProduct extends BaseProduct{

	public ShirtProduct(int id,double price) {
		super(id, price);
	}
	@Override
	public double price() {
		return getPrice();
	}

	@Override
	public void addToCart() {
		System.out.println("adding ShirtProduct "+getId()+ " with price "+ getPrice()+" to the cart");
	}

}
