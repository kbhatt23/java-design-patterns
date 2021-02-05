package employeeexample;

public class PrintEmployeeDetailsVisitor implements EmployeeVisitor{

	@Override
	public void visit(Programmer programmer) {
		System.out.println("Programmer "+programmer.getName()+" have speciality in "+programmer.getLanguage());
	}

	@Override
	public void visit(TeamLead teamLead) {
		System.out.println("Team lead "+teamLead.getName()+" have "+teamLead.getReporters().size()+" developers as reportees");
		
	}

	@Override
	public void visit(Manager manager) {
		System.out.println("Manager "+manager.getName()+" have "+manager.getReporters().size()+" team leads as reportees");
	}

	@Override
	public void visit(VicePresident vicePresident) {
		System.out.println("Vice President "+vicePresident.getName()+" have "+vicePresident.getReporters().size()+" managers as reportees");
	}
	
	@Override
	public void visit(UnrelatedObject unrelatedObject) {
		System.out.println("Printing unrelated object with "+unrelatedObject.getProperty1()+" and "+unrelatedObject.getProperty2());
	}
	

}
