package employeeexample;

public interface EmployeeVisitor {

	// define method for each type of employees

	void visit(Programmer programmer);

	void visit(TeamLead teamLead);

	void visit(Manager manager);

	void visit(VicePresident vicePresident);

	void visit(UnrelatedObject unrelatedObject);
}
