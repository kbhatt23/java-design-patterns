package areaCalculator;

public class CircleCalculator implements Circle{

	@Override
	public void calculateAndPrintArea(int radius) {
		System.out.println("circle area: "+(22/7)*radius*radius);
	}

}
