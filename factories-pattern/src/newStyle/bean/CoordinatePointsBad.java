package newStyle.bean;
public class CoordinatePointsBad {
	@Override
	public String toString() {
		return "CoordinatePointsBad [x=" + x + ", y=" + y + "]";
	}
	//how about using another way
	//example  rho and theta
	private double x;
	private double y;
	public CoordinatePointsBad(double a, double b, String cartestian ) {
		
		if("polar".equals(cartestian)) {
			this.x = a * Math.cos(b);
			this.y = b * Math.sin(b);
		}else {
			this.x = a;
			this.y = b;
		}
		
	}
	//another cousturctor with same fields data type but differnet variable
	//we can not use below
	/*
	 * public CoordinatePoints(double rho, double theta) { this.x =
	 * rho*Math.cos(theta); this.y = rho*Math.sin(theta); }
	 */
	
}

