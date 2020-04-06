package developerTesterExample;

import java.util.ArrayList;
import java.util.List;

public class DeveloperTesterClient {
public static void main(String[] args) {
	
	Employee dev = EmployeeFactory.getEmployeeByRole("dev");
	
	dev.setName("kbhatt1");
	dev.assignTask("TASK1");
	dev.startWork();
	
	System.out.println("-==================");
Employee dev1 = EmployeeFactory.getEmployeeByRole("dev");
	
dev1.setName("kbhatt2");
dev1.assignTask("TASK2");
dev1.startWork();
System.out.println("-==================");
Employee dev2 = EmployeeFactory.getEmployeeByRole("dev");
	
dev2.setName("kbhatt3");
dev2.assignTask("TASK3");
dev2.startWork();
	
System.out.println("-==================");
Employee dev3 = EmployeeFactory.getEmployeeByRole("dev");
	
dev3.setName("kbhatt4");
dev3.assignTask("TASK4");
dev3.startWork();


Employee qa = EmployeeFactory.getEmployeeByRole("qa");

qa.setName("qa1");
qa.assignTask("TASK1");
qa.startWork();

System.out.println("-==================");
Employee qa2 = EmployeeFactory.getEmployeeByRole("qa");

qa.setName("qa2");
qa.assignTask("TASK2");
qa.startWork();
System.out.println("-==================");
Employee qa3 = EmployeeFactory.getEmployeeByRole("qa");

qa3.setName("qa3");
qa3.assignTask("TASK3");
qa3.startWork();

System.out.println("-==================");
Employee qa4 = EmployeeFactory.getEmployeeByRole("qa");

qa4.setName("qa4");
qa4.assignTask("TASK4");
qa4.startWork();
	
	
}
}
