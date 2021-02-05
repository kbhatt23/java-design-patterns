package basicexample;

public class BadClient {
public static void main(String[] args) {
	NumberManipulationBad bad= new NumberManipulationBad(4, 2);
	System.out.println("add result "+bad.add());
	
	System.out.println("substract result "+bad.subsract());
	
	//any new functionality will need a change in the main class to add a new method
}
}
