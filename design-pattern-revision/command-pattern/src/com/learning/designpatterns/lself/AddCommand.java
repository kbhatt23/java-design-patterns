package com.learning.designpatterns.lself;

public class AddCommand extends AbstractCalculatorCommand {

	private int number1;
	private int number2;

	public AddCommand(int number1, int number2, CalculatorCommandReciever calculatorImplementor) {
		super(calculatorImplementor);
		this.number1 = number1;
		this.number2 = number2;
	}

	@Override
	public void execute() {
		System.out.println("AddCommand command called");
		calculatorImplementor.executeAddCommand(number1, number2);
	}

}
