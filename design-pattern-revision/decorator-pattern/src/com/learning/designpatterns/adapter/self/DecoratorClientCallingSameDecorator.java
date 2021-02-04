package com.learning.designpatterns.adapter.self;

public class DecoratorClientCallingSameDecorator {
	public static void main(String[] args) {

		//WayOneManipulation wayOneManipulation = new WayOneManipulation(new WayTwoManipulation(new BaseClass()));
		
		//should we consider allowing same operation n time
		//if same operation can be done only once we must override hashCode and equls and check in mani[ulate method
		WayTwoManipulation wayTwoManipulation = new WayTwoManipulation(new WayTwoManipulation(new BaseClass()));
		wayTwoManipulation.manipulate();
	}
}
