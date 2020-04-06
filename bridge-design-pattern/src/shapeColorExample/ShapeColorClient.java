package shapeColorExample;

public class ShapeColorClient {

	public static void main(String[] args) {
		//implementation layer
		Color red = new Red();
		Color green = new Green();
		
		Shape rectangle = new Rectangle(red, green);
		rectangle.drawShape();
		Shape circle = new Circle(red, green);
		circle.drawShape();
	}

}
