package calcuationOperationExample;

public class AdditionStrategy implements CalculationStrategy {

	@Override
	public double calculate(double a, double b) {
		System.out.println("runnig addition strategy for number" + a+ " and "+b);
		return a+b;
	}

}
