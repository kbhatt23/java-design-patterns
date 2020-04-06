package selfLearning;

public class RectangleShape extends ShapeDecorator{

	public RectangleShape(Shape rootShape) {
		super(rootShape);
	}
	@Override
	public void drawYourShape() {
		System.out.println("drawing rectangle shape");
	}

}
