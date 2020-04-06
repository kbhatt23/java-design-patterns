package shapeColorExample;

public abstract class Shape {

	protected Color color1;
	protected Color color2;
	protected Shape(Color color1, Color color2) {
		this.color1 = color1;
		this.color2 = color2;
	}
	
	public abstract void drawShape();
}
