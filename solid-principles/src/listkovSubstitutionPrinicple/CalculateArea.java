package listkovSubstitutionPrinicple;

public class CalculateArea {

	public static void main(String[] args) {
		Rectangle r1= new Rectangle(2, 10);
		
		Square sq = new Square(5);
		testAreaCalculate(r1);
		System.out.println(sq.getHeight() + " : "+sq.getWidth());
		testAreaCalculate(sq);
		
	}
	
	static void testAreaCalculate(Rectangle r1 ) {
		
		int width = r1.getWidth();
		r1.setHeight(3);
		System.out.println("Expected area is "+3*width+ " actual area is "+r1.calculateArea() );
		
	}

}
