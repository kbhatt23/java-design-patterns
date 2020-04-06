package areaCalculator;

public class AreaCalucatorClient {

	public static void main(String[] args) {
		Rectangle rectangle = new RectangleCalculator(23,32);
		manageArea(rectangle);
		
		Circle circle = new CircleCalculator();
		Rectangle circleAdapter = new CircleAdapter(circle,32);
		manageArea(circleAdapter);
	}

	private static void manageArea(Rectangle rectangle) {
		System.out.println("rectangle ka kaam");
		rectangle.calculateAndPrintArea(rectangle.getLength(),rectangle.getWidth());
	}
}
