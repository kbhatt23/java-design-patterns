package interfaces;

public class AdditionManipulator implements Manipulator<Double, Double> {

	@Override
	public Double manipulate(Double a, Double b) {
		return a+b;
	}

}
