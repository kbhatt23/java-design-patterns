package com.learning.designpatterns.simplefactory;

public class ProductUsage {
	public static void main(String[] args) {
		IProduct shirt = IProduct.createProduct(1, 100, ShirtProduct.class);
		handleCartAddition(shirt);
		
		IProduct shoe = IProduct.createProduct(2, 200, ShoeProduct.class);
		handleCartAddition(shoe);
		
		IProduct fakeProduct = IProduct.createProduct(2, 200, BaseProduct.class);
		handleCartAddition(fakeProduct);
	}

	private static void handleCartAddition(IProduct shirt) {
		System.out.println("price of product is "+shirt.price());
		shirt.addToCart();
	}
}
