package interfaces;

public class Addition implements Calculator<Double, Double> {

	@Override
	public Double calculate(Double a, Double b) {
		return a+b;
	}


}
