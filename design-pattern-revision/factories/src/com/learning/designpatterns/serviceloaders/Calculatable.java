package com.learning.designpatterns.serviceloaders;
public interface Calculatable {

	long calculate(int num1, int num2);
}

class SumCalculator implements Calculatable
{

	@Override
	public long calculate(int num1, int num2) {
		return num1+num2;
	}
	
}

class MultiplyCalculator implements Calculatable
{

	@Override
	public long calculate(int num1, int num2) {
		return num1*num2;
	}
	
}
