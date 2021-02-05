package basicexample;

public class ThreeNumberVisitorclient {
	public static void main(String[] args) {

		NumberVisitor visitor1 = new AddNumberVisitor();
		NumberVisitor visitor2 = new SubstractNumberVisitor();
		NumberVisitor visitor3 = new DivisionNumberVisitor();
		
		ThreeNumberManipulationVisitable obj = new ThreeNumberManipulationVisitable(20, 5, 2);
		
		System.out.println("visitor 1 result "+obj.accept(visitor1));
		System.out.println("visitor 2 result "+obj.accept(visitor2));
		System.out.println("visitor 3 result "+obj.accept(visitor3));
	}
}
