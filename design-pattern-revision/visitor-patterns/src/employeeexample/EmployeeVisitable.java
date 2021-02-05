package employeeexample;

//any clas whose fnctiaonlity can be amde dynbamic
//in future new functiona;lty is needed no need to modify that class
public interface EmployeeVisitable {

	void accept(EmployeeVisitor employeeVisitor);
	
}
