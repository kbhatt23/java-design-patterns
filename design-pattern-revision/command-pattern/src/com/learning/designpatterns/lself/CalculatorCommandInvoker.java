package com.learning.designpatterns.lself;

public class CalculatorCommandInvoker {

	private CalculatorCommand command;

	public CalculatorCommandInvoker(CalculatorCommand command) {
		this.command = command;
	}
	
	public void executeCommand() {
		command.execute();
	}
	
}
