package com.learning.designpatterns.simplefactory;

public class ShoeProduct extends BaseProduct{

	public ShoeProduct(int id,double price) {
		super(id, price);
	}
	@Override
	public double price() {
		return getPrice();
	}

	@Override
	public void addToCart() {
		System.out.println("adding ShoeProduct "+getId()+ " with price "+ getPrice()+" to the cart");
	}

}
