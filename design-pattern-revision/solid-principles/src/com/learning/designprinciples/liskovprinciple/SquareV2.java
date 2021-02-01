package com.learning.designprinciples.liskovprinciple;

//child class -> check if substitutability is good
//break the heirachy to solve the bad substituatbility problem
public class SquareV2 /* extends Rectangle */ implements Shape {

	private int side;

	// height and
	public SquareV2(int side) {
		this.side = side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public int getSide() {
		return this.side;
	}

	@Override
	public int calculateArea() {
		return side*side;
	}
}
