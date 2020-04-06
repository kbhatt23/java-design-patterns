package developerTesterExample;

import java.util.HashMap;
import java.util.Map;

public class EmployeeFactory {
	private static Map<String, Employee> employees = new HashMap<String, Employee>();
	
	public static Employee getEmployeeByRole(String role) {
		Employee employee =null;
		if(employees.containsKey(role)) {
			employee =  employees.get(role);
		}else {
			switch (role) {
			case "dev":
				System.out.println("Creating fresh developer ");
				employee = new Developer(role);
				break;
			case "qa":
				System.out.println("Creating fresh tester ");
				employee = new Tester(role);
				break;

			default:
				throw new RuntimeException("Employee not supported");
			}
			employees.put(role, employee);
		}
		return employee;
	}
}
