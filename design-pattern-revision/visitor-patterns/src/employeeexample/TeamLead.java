package employeeexample;

public class TeamLead extends AbstractEmployee{

	public TeamLead(String name, AbstractEmployee... employees) {
		super(name,employees);
	}

	@Override
	public void accept(EmployeeVisitor employeeVisitor) {
		employeeVisitor.visit(this);
	}

}
