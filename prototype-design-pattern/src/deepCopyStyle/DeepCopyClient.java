package deepCopyStyle;

public class DeepCopyClient {
public static void main(String[] args) {
	SampleClass sa = new SampleClass(87, "kanishk");
	Point point = new Point(10, 11, "raguwar das", sa);
	
	//instead of creating new use clone instead as propertype deisgn pattern
	//shallow copy
	Point newPoint  = point;
	newPoint.setX(23);
	newPoint.getSampleClass().setMarks(99);
	
	System.out.println(point);
	System.out.println(newPoint);
	
	//clone which is one level copy of classes
	
	try {
		newPoint=(Point) point.clone();
		newPoint.setX(66);
		newPoint.getSampleClass().setMarks(66);
		
		System.out.println("clone basic usage");
		System.out.println(point);
		System.out.println(newPoint);
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
