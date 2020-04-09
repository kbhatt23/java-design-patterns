package calcuationOperationExample;

public class MultiplicationStrategy implements CalculationStrategy {

	@Override
	public double calculate(double a, double b) {
		System.out.println("runnig multiplication strategy for number" + a+ " and "+b);
		return a*b;
	}

}
