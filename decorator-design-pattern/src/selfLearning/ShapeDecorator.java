package selfLearning;

//combining decorator with tempalte method
public abstract class ShapeDecorator implements Shape{

	private Shape rootShape;
	public ShapeDecorator(Shape rootShape) {
		this.rootShape = rootShape;
	}
	@Override
	public void draw() {
		rootShape.draw();
		drawYourShape();
	}
	
	public abstract void drawYourShape();

}
