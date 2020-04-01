package openClosedPrinciple.badWay;

public class AreaCalucatorClient {

	public static void main(String[] args) {

		Rectangle rectangel = new Rectangle();
		rectangel.setLength(21);
		rectangel.setWidth(11);
		AreaCalucator calcualtor = new AreaCalucator();
		System.out.println(calcualtor.calculateRectangleArea(rectangel));
		
		Circle circle = new Circle();
		circle.setRadius(22);
		System.out.println(calcualtor.calculateCircleArea(circle));
	}

}
