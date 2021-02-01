package com.learning.oopscocepts.designprinciples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//write code so that in future same class is not needed to be modified for new implementations
//just like delgation example we could use interface for that, but herer i am using functional programming
public class OpenClosePrincipleUsage2 {
	public static void main(String[] args) {
		System.out.println(AreaCalculatorHelper.calculateArea(new Rectangle(2, 3)));

		System.out.println(AreaCalculatorHelper.calculateArea(new Square(2)));

		// we could another shape like circle
		System.out.println(AreaCalculatorHelper.calculateArea(new Circle(2)));

		// object can not be passed , only shape is passed and if we create chil of
		// shape it has to implement the area calcuate method
		// System.out.println(AreaCalculatorHelper.calculateArea(new Object()));
	}
}

interface Shape {
	double calculateArea();
}

class Square implements Shape {

	private int size;

	public Square(int size) {
		this.size = size;
	}

	@Override
	public double calculateArea() {
		return size * size;
	}

}

class Rectangle implements Shape {

	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double calculateArea() {
		return width * length;
	}

}

class Circle implements Shape {

	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}

}

class AreaCalculatorHelper {
	public static double calculateArea(Shape shape) {
		return shape.calculateArea();
	}
}