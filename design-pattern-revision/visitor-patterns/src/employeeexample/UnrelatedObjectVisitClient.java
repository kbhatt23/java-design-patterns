package employeeexample;

public class UnrelatedObjectVisitClient {
	public static void main(String[] args) {
		EmployeeVisitor visitor = new PrintEmployeeDetailsVisitor();
		
		UnrelatedObject obj = new UnrelatedObject(1, "jai shree ram");
		obj.accept(visitor);
	}

}
