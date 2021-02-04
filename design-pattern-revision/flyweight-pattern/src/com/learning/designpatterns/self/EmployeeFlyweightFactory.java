package com.learning.designpatterns.self;

import java.util.HashMap;
import java.util.Map;

import com.learning.designpatterns.self.Employee.Skill;

public class EmployeeFlyweightFactory {
	private static Map<Skill, Employee> employeeMap = new HashMap<>();

	// since contract is for interface thats why extrinsic property to be updated by
	// client must be present in interface
	public static Employee fetchEmployee(Skill skill) {
		if (!employeeMap.containsKey(skill)) {
			//if item nto present then put it
			System.out.println("Creating new employee with skill "+skill);
			employeeMap.put(skill, skill.fetchEmployee());
		}
		//no need of switch case and chance of mistake that missing type
		return employeeMap.get(skill);
	}
}
