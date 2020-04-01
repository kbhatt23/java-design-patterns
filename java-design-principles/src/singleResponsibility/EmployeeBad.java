package singleResponsibility;

public class EmployeeBad {
	//private fields enhnaces encapsulation
	//encapsulation reduces tight coupling, one class depending on another
	private String employeeId;
	private String address;
	private int age;
	private double salary;
	//in case logic changes wr are fored to update empoyee class
	public double caclculateTax() {
		//logic to calculate Tax and returns tax
		return 101.101;
	}
	
	public void submitTaxProofs() {
		//logic to submit the taxproofs
	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
