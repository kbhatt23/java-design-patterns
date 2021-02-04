package com.learning.designpatterns.lself;

//this has actual implementation 
//unlike strategy command wont have actual business ogic, but just know whihc reciever and its method to call
public class CalculatorCommandReciever {

	public void executeAddCommand(int number1, int number2) {
		System.out.println("AddCommand command result " + (number1 + number2));
	}

	public void executeAddCommand(int number1, int number2, int number3) {
		System.out.println("AddThreeNumbersCommand command result " + (number1 + number2 + number3));
	}

	public void executeSubstractCommand(int number1, int number2) {
		System.out.println("SubstractCommand command result " + (number1 - number2));
	}

}
