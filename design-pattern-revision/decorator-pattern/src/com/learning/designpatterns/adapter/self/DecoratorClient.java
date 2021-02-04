package com.learning.designpatterns.adapter.self;

public class DecoratorClient {
	public static void main(String[] args) {

		WayOneManipulation wayOneManipulation = new WayOneManipulation(new WayTwoManipulation(new BaseClass()));
		wayOneManipulation.manipulate();
	}
}
