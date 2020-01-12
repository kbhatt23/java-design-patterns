package newStyle.bean;

public class CoordinatePointsGood {
	@Override
	public String toString() {
		return "CoordinatePointsGood [x=" + x + ", y=" + y + "]";
	}
	//how about using another way
	//example  rho and theta
	private double x;
	private double y;
	private CoordinatePointsGood(double x, double y) {
		this.x = x;
		this.y = y;
	}
	//another cousturctor with same fields data type but differnet variable
	//we can not use below
	/*
	 * public CoordinatePoints(double rho, double theta) { this.x =
	 * rho*Math.cos(theta); this.y = rho*Math.sin(theta); }
	 */
	//static factory class
	public static CoordinatePointsGood createBean(double a, double b , String cartestian) {
		if("polar".equals(cartestian)) {
			return new CoordinatePointsGood(a * Math.cos(b), b * Math.sin(b));
		}else {
			return new CoordinatePointsGood(a , b);
		}
	}
}
