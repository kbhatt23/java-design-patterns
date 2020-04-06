package developerTesterExample;

public class Tester implements Employee{
	//extrinSic Properties
		private String employeeName;
		//extrinSic Properties
		private String taskId;
		
		private final String role;
		public Tester(String role) {
			this.role = role;
		}
		
		@Override
		public void setName(String empName) {
			employeeName = empName;
		}

		@Override
		public void assignTask(String taskID) {
			System.out.println("Assigning task "+taskID + " to tester "+employeeName);
			taskId = taskID;
		}

		@Override
		public void startWork() {
			System.out.println("Tester "+employeeName + " started working on task "+taskId );
		}
		
		@Override
		public String getRole() {
			return this.role;
		}

}
