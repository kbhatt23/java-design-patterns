package com.learning.designpatterns.lself;

public abstract class AbstractCalculatorCommand implements CalculatorCommand{

	//minimum it should have a reciever
	protected CalculatorCommandReciever calculatorImplementor;

	public AbstractCalculatorCommand(CalculatorCommandReciever calculatorImplementor) {
		this.calculatorImplementor = calculatorImplementor;
	}
	
	
	
	
}
