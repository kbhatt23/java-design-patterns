package employeeexample;

public class EmployeeVisitorClient {
	public static void main(String[] args) {

		EmployeeVisitor printVisitor = new PrintEmployeeDetailsVisitor();

		AbstractEmployee employeeRoot = createEmployeeGraph();
		
		visitEmployeeGraph(employeeRoot,printVisitor);
	}

	private static void visitEmployeeGraph(AbstractEmployee employeeRoot, EmployeeVisitor printVisitor) {
		employeeRoot.accept(printVisitor);
		employeeRoot.getReporters().forEach(employee -> visitEmployeeGraph(employee, printVisitor));
//		printVisitor.visit(employeeRoot);
//		employeeRoot.getReporters().forEach(employee -> visitEmployeeGraph(employee, printVisitor));
	}
//below methods are bad approach
//	private static void visitEmployeeGraph(Manager manager, EmployeeVisitor printVisitor) {
//		printVisitor.visit(manager);
//		manager.getReporters().forEach(employee -> visitEmployeeGraph(employee, printVisitor));
//	}
//	private static void visitEmployeeGraph(TeamLead teamLead, EmployeeVisitor printVisitor) {
//		teamLead.accept(printVisitor);
//		printVisitor.visit(teamLead);
//		teamLead.getReporters().forEach(employee -> visitEmployeeGraph(employee, printVisitor));
//	}
//
//	private static void visitEmployeeGraph(Programmer programmer, EmployeeVisitor printVisitor) {
//		printVisitor.visit(programmer);
//	}

	private static AbstractEmployee createEmployeeGraph() {
		AbstractEmployee kanishk = new Programmer("kanishk", "java");
		AbstractEmployee sourabh = new Programmer("sourabh", "java");
		AbstractEmployee priyanka = new Programmer("priyanka", "java");
		
		AbstractEmployee lekshmi = new Programmer("lekshmi", "ios");
		AbstractEmployee vijay = new Programmer("vijay", "android");
		
		AbstractEmployee lead1 = new TeamLead("jayanth", kanishk,sourabh,priyanka);
		
		AbstractEmployee lead2 = new TeamLead("ravi", vijay,lekshmi);
		
		AbstractEmployee manager = new Manager("sunil", lead1,lead2);
		
		AbstractEmployee vicePresident = new VicePresident("Manish", manager);
		return vicePresident;
				
	}
}
