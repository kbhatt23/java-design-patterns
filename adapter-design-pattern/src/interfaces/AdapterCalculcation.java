package interfaces;

public class AdapterCalculcation implements Calculator<Double, Double>{
	
	private Manipulator<Double, Double> manipulator;
	
	public AdapterCalculcation(Manipulator<Double, Double> manipulator) {
		this.manipulator = manipulator;
	}

	@Override
	public Double calculate(Double a, Double b) {
		return manipulator.manipulate(a, b);
	}

}
