package com.learning.designpatterns.serviceloaders;

import java.util.Iterator;
import java.util.ServiceLoader;

public class CalcualtorLoaderExample {
//service loader good contracct provider
	public static void main(String[] args) {
		System.out.println("jai shree ram");
		int num1 = 10;
		int num2 = 20;
		ServiceLoader<Calculatable> calcualtables = ServiceLoader.load(Calculatable.class);
		
		Iterator<Calculatable> calcualtablesIterator = calcualtables.iterator();
		
		while(calcualtablesIterator.hasNext()) {
			Calculatable next = calcualtablesIterator.next();
			System.out.println("current calucaltor result "+next.calculate(num1, num2));
		}
			
	}
}
