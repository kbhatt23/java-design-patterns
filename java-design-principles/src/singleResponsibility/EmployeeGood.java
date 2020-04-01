package singleResponsibility;

public class EmployeeGood {
	//private fields enhnaces encapsulation
	//encapsulation reduces tight coupling, one class depending on another
	private String employeeId;
	private String address;
	private int age;
	private double salary;
	
	private HRDepartmentUtils hrUtils;
	
	private FinanceDepartmentUtils financeUtils;
	
	//in case logic changes we are fored to update empoyee class
	//so we can use delegation to intrduce single responsibility
	//below shud be resposnibity of FinanceDepartment class
	public double caclculateTax() {
		//logic to calculate Tax and returns tax
		//remove the logic and delegate to finance util class
		return financeUtils.caclculateTax(this);
	}
	
	//so we can use delegation to intrduce single responsibility
		//below shud be resposnibity of HRDepartment class
	public void submitTaxProofs() {
		//remove the logic to submit the taxproofs
		//delegate to hr util class
		hrUtils.submitTaxProofs(this);
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
