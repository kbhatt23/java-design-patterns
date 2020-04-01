package openClosedPrinciple.usingInheritance;

public class Circle implements Shape{

	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateShape() {
		return (22/7) * radius*radius;
	}
}
