package openClosedPrinciple.badWay;

public class AreaCalucator {

	//if a new shape comes this class will keep on modifying
	//so along with new shape class this class will also get modified which
	//adds unit testing of this class as well
	public double calculateRectangleArea(Rectangle rectangle) {
		return rectangle.getLength()* rectangle.getWidth();
	}
	
	public double calculateCircleArea(Circle circle) {
		return (22/7)*circle.getRadius()*circle.getRadius();
	}
}
