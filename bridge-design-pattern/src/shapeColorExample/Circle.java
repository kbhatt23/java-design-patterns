package shapeColorExample;

public class Circle extends Shape{

	protected Circle(Color color1, Color color2) {
		super(color1, color2);
	}

	@Override
	public void drawShape() {
		System.out.println("Started drawing Circle");
		color1.fillColor();
		//flexibility
		//we already would be knowing at that time what all colors are avaible for specific shape
		//for newer we create new class and would be kbowng colors of that shape at that time
		//color2.fillColor();
		System.out.println("Completed drawing Circle");
	}

}
