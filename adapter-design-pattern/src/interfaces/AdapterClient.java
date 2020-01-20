package interfaces;

public class AdapterClient {
public static void main(String[] args) {
	//below client is already written
	//as part of open closed pricncipe
	//we shoudl not let modify the existing code
	//Calculator<Double, Double> additioncalculator = new Addition();
	
	Calculator<Double, Double> additioncalculator = new AdapterCalculcation(new AdditionManipulator());
	
	System.out.println(additioncalculator.calculate(23D, 32D));
}

}
