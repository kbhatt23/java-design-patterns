package areaCalculator;

public class CircleAdapter implements Rectangle{
	private Circle circle;
	private int radius;
	
	public CircleAdapter(Circle circle , int radius) {
		this.circle = circle;
		this.radius = radius;
	}


	@Override
	public void calculateAndPrintArea(int length, int width) {
		if(length != width) {
			throw new RuntimeException("does not support this parameters");
		}
		circle.calculateAndPrintArea(length);	
	}


	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return radius;
	}


	@Override
	public int getWidth() {
		return radius;
	}

}
