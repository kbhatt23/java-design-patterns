package basicexample;

public class NumberManipulationBad {

	private int number1;
	
	private int number2;

	public NumberManipulationBad(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	
	//today we need functionality to add
	public int add() {
		return number1+number2;
	}
	
	//now again if we need to put more functionalities
	//like substract, divide etc then we have to modify this class
	//visitor patter make sure new functioanlty can be addded without modifying this class
	
	public int subsract() {
		return number1-number2;
	}
}
