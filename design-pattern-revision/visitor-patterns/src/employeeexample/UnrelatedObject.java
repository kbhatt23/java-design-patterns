package employeeexample;

public class UnrelatedObject implements EmployeeVisitable{

	private int property1;
	
	private String property2;

	public UnrelatedObject(int property1, String property2) {
		this.property1 = property1;
		this.property2 = property2;
	}

	public int getProperty1() {
		return property1;
	}

	public void setProperty1(int property1) {
		this.property1 = property1;
	}

	public String getProperty2() {
		return property2;
	}

	public void setProperty2(String property2) {
		this.property2 = property2;
	}

	@Override
	public void accept(EmployeeVisitor employeeVisitor) {
		employeeVisitor.visit(this);
	}
	
	
	
}
