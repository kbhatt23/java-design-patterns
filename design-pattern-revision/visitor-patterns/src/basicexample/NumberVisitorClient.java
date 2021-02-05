package basicexample;

public class NumberVisitorClient {
	public static void main(String[] args) {
		NumberVisitor visitor1 = new AddNumberVisitor();
		
		NumberVisitor visitor2 = new SubstractNumberVisitor();
		NumberVisitor visitor3 = new DivisionNumberVisitor();

		NumberManipulatorVisistable obj = new NumberManipulationVisitable(10, 5);
		
		System.out.println("result of visitor one is "+obj.accept(visitor1));
		System.out.println("result of visitor two is "+obj.accept(visitor2));
		System.out.println("result of visitor three is "+obj.accept(visitor3));
	}
}
