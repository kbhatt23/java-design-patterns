package com.learning.designpatterns.lself;

public class AddThreeNumbersCommand extends AbstractCalculatorCommand{
	
	private int number1;
	private int number2;
	private int number3;

	public AddThreeNumbersCommand(int number1, int number2,int number3, CalculatorCommandReciever calculatorImplementor) {
		super(calculatorImplementor);
		this.number1 = number1;
		this.number2 = number2;
		this.number3=number3;
	}

	@Override
	public void execute() {
		System.out.println("AddThreeNumbersCommand command called");
		calculatorImplementor.executeAddCommand(number1,number2,number3);
	}

}
