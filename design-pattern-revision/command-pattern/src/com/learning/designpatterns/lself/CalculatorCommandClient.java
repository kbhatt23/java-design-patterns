package com.learning.designpatterns.lself;

public class CalculatorCommandClient {
	public static void main(String[] args) {
		CalculatorCommandReciever calculatorImplementor = new CalculatorCommandReciever();
		CalculatorCommand addCommand = new AddCommand(2, 2,calculatorImplementor);
		//reciever can do things like do undo add to queue etc
		CalculatorCommandInvoker reciever= new CalculatorCommandInvoker(addCommand);
		reciever.executeCommand();
		
		System.out.println("==============");
		CalculatorCommand substCalculatorCommand = new SubstractCommand(10, 4, calculatorImplementor);
		CalculatorCommandInvoker invoker= new CalculatorCommandInvoker(substCalculatorCommand);
		invoker.executeCommand();
	}
}
