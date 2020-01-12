package constructorCopy;

public class ConstructorCopyClient {
public static void main(String[] args) {
	Address address = new Address("delhi", 110075, "c502 majestic apratment");
	Employee employee = new Employee(23, "hanuman", address);
	System.out.println("main class is "+employee);
	
	//shallow copy
	//Employee newEmployee = employee;
	//newEmployee.setAge(56);
	//newEmployee.getAddress().setCity("ranikhet");
	//System.out.println("new copy is "+newEmployee);
	//System.out.println("main class is "+employee);
	//we can use deepcopy clone

	//but nbetter is copyconstructor call
	Employee newEmployee = new Employee(employee);
		newEmployee.setAge(56);
		newEmployee.getAddress().setCity("ranikhet");
		System.out.println("new copy is "+newEmployee);
		System.out.println("main class is "+employee);
}


}
