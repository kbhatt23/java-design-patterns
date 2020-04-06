package shapeColorExample;

public class Rectangle extends Shape{

	protected Rectangle(Color color1, Color color2) {
		super(color1, color2);
	}

	@Override
	public void drawShape() {
		System.out.println("Started drawing Rectangle");
		color1.fillColor();
		color2.fillColor();
		System.out.println("Completed drawing Rectangle");
	}

}
