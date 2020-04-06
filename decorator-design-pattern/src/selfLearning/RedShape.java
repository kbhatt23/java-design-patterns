package selfLearning;

public class RedShape extends ShapeDecorator{

	public RedShape(Shape rootShape) {
		super(rootShape);
	}
	

	@Override
	public void drawYourShape() {
		System.out.println("drawing red color to shape");		
	}
	

}
