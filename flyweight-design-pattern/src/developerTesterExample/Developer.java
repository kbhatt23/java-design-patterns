package developerTesterExample;

public class Developer implements Employee{
	//extrinSic Properties :to add contractual obligation
	private String employeeName;
	//extrinSic Properties
	private String taskId;
	
	//intrincis properties can be kept here directly
	//intrinsic properties should be immutable
	//as for all dev this property will be same
	private final String role;
	public Developer(String role) {
		this.role = role;
	}
	
	
	@Override
	public void setName(String empName) {
		employeeName = empName;
	}

	@Override
	public void assignTask(String taskID) {
		System.out.println("Assigning task "+taskID + " to developer "+employeeName);
		taskId = taskID;
	}

	@Override
	public void startWork() {
		System.out.println("Developer "+employeeName + " started working on task "+taskId );
	}


	@Override
	public String getRole() {
		return this.role;
	}

}
