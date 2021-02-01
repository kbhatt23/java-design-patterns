package com.learning.designpatterns.simplefactory;

public interface IProduct {

	
	public double price();
	
	public void addToCart();
	
	//creating simple factory here itself
	//not taking string instead passing the type of item
	//type safety check also added
	//just ignoring kiss principle as of now as we have complex if else condition
	//had to ignore kiss principle as we have to call constructor everytime to create new object again
	public static IProduct createProduct(int id, double price, Class<? extends IProduct> type) {
		//could have used 
		
		//could even be using builder pattern or other creational pattern to create complex object like prototype
		if(type == ShoeProduct
				.class) {
			return new ShoeProduct(id, price);
		}
		else if(type== ShirtProduct.class) {
			return new ShirtProduct(id, price);
		}else {
			throw new UnsupportedOperationException("We do not support of this type "+type );
		}
	}
	
}
