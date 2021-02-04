package com.learning.designpatterns.lself;

public class SubstractCommand extends AbstractCalculatorCommand{

	//state data for command
	private int number1;
	private int number2;

	public SubstractCommand(int number1, int number2,CalculatorCommandReciever calculatorImplementor) {
		super(calculatorImplementor);
		this.number1 = number1;
		this.number2 = number2;
	}

	@Override
	public void execute() {
		System.out.println("SubstractCommand command called");
		calculatorImplementor.executeSubstractCommand(number1, number2);
	}

}
