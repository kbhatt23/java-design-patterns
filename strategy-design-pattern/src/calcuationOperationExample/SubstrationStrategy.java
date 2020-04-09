package calcuationOperationExample;

public class SubstrationStrategy implements CalculationStrategy {

	@Override
	public double calculate(double a, double b) {
		System.out.println("runnig substraction strategy for number" + a+ " and "+b);
		return a-b;
	}

}
