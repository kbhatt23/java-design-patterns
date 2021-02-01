package com.learning.designprinciples.liskovprinciple;

//a base class 
public class Rectangle {

	private int length;
	
	private int width;
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int calculateArea() {
		return length* width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	
}
