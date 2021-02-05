package employeeexample;

public class Manager extends AbstractEmployee{
	
	public Manager(String name, AbstractEmployee... employees) {
		super(name,employees);
	}

	@Override
	public void accept(EmployeeVisitor employeeVisitor) {
		employeeVisitor.visit(this);
	}
}
