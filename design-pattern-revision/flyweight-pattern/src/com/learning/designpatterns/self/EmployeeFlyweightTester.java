package com.learning.designpatterns.self;

import java.util.Random;

import com.learning.designpatterns.self.Employee.Skill;

public class EmployeeFlyweightTester {
	private static Skill[] skills = new Skill[] { Skill.DEVELOPER, Skill.TESTER };
	private static Random random = new Random();

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			Skill skill = findRandomSkill();
			// update the extrincis proeprties differnet for each instance
			Employee employee = EmployeeFlyweightFactory.fetchEmployee(skill);
			employee.updateName("employee:" + i);
			employee.updateSkill(skill);
			System.out.println("hash code of employee "+employee.hashCode());
			employee.startTask();
		}
	}

	private static Skill findRandomSkill() {
		// will always be 0 or size -1 or in between and hence never out of bound
		int nextInt = random.nextInt(skills.length);
		return skills[nextInt];
	}
}
