package com.learning.designprinciples.liskovprinciple;
//child class -> check if substitutability is good
public class Square extends Rectangle{

	//height and 
	public Square(int side) {
		super(side,side);
	}
	
	//we can update the length and width
	@Override
	public void setLength(int side) {
		//no need to call super
		setSide(side);
	}
	
	@Override
	public void setWidth(int side) {
		//no need to call super so easily
		setSide(side);
	}

	public void setSide(int side) {
		super.setLength(side);
		super.setWidth(side);
	}
}
