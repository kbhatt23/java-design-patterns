package com.learning.designprinciples.liskovprinciple;

public class LiskovSubstitutionBreak {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(5, 4);
		printArea(rectangle);
		validateSizes(rectangle);
		Rectangle square = new Square(5);
		printArea(square);
		validateSizes(square);
	}
	
	//this one works fine, for this behavior substituion is fine
	private static void printArea(Rectangle rectangle) {
		System.out.println(rectangle.calculateArea());
	}
	
	//if we pass child square this behavior breaks
	private static void validateSizes(Rectangle rectangle) {
		int newLength = 10;
		int newwidth  = 7;
		rectangle.setLength(newLength);
		rectangle.setWidth(newwidth);
		//this wont cause issue
		printArea(rectangle);
		
		// new height and new width should show up in the object
		System.out.println("newwidth updated succesfully:: "+(rectangle.getWidth() == newwidth));
		
		System.out.println("newLength updated succesfully:: "+(rectangle.getLength() == newLength));
	}
}
