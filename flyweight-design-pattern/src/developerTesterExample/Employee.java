package developerTesterExample;

public interface Employee {
	//extrincsic properties as kept here
	void setName(String empName);
	void assignTask(String taskID);
	//instrinsic properties that are common for all are not needed
	
	//contractual methods can be kept here
	public void startWork();
	
	//fake intrinsic proeprty
	String getRole();
	
}
