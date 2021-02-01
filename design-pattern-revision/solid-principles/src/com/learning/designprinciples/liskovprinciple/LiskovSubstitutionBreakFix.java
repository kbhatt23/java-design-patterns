package com.learning.designprinciples.liskovprinciple;

public class LiskovSubstitutionBreakFix {
	public static void main(String[] args) {
		RectangleV2 rectangle = new RectangleV2(5, 4);
		printArea(rectangle);
		validateSizes(rectangle);
		//extends not possible -> broke the heirachy
		//RectangleV2 square = new SquareV2(5);
		Shape square = new SquareV2(5);
		printArea(square);
		//can take rectangel only and not shape or supposedly child square
		//validateSizes(square);
	}
	
	//this one works fine, for this behavior substituion is fine
	//area substitution have no issues and hence shape is fine, can pass rectangle as well as square
	private static void printArea(Shape rectangle) {
		System.out.println(rectangle.calculateArea());
	}
	
	
	//if we pass child square this behavior breaks
	private static void validateSizes(RectangleV2 rectangle) {
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
