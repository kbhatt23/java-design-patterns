package employeeexample;

public class VicePresident extends AbstractEmployee{
	
	public VicePresident(String name,AbstractEmployee... employees) {
		super(name,employees);
	}
	
	@Override
	public void accept(EmployeeVisitor employeeVisitor) {
		employeeVisitor.visit(this);
	}
}