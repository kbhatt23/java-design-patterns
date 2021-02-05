package employeeexample;

import java.util.ArrayList;
import java.util.List;

//we want to make this class visitable
//meaning some functionaliotues of this can be made flexible without modifying anything in this class
//that flexible implemetation can be done using vistor interface implementation
public abstract class AbstractEmployee implements EmployeeVisitable {

	// states that are common for all emplyees

	private String name;
	
	private List<AbstractEmployee> reporters;

	public AbstractEmployee(String name, AbstractEmployee... employees) {
		this.name = name;
		reporters = new ArrayList<>();
		for (AbstractEmployee employee : employees) {
			reporters.add(employee);
		}
	}

	// this passes abstractemployee
	// but as we know in a method we can only pass that type or its child but not
	// super class's object
	// hence in visitor there is no such method to handle abstractemployee
//	@Override
//	public void accept(EmployeeVisitor employeeVisitor) {
//		employeeVisitor.visit(this);
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<AbstractEmployee> getReporters() {
		return reporters;
	}

	public void setReporters(List<AbstractEmployee> reporters) {
		this.reporters = reporters;
	}


}
