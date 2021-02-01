package com.learning.oopscocepts.basics;

public class AggrateClass {

	public static void main(String[] args) {
//stack variable holds teacher object 
		Principal teacher = new Principal("radha madhav", "everything", 0);
		
		College college = new College("bhagwat gita", teacher);
		
		System.out.println(college);
		System.out.println(teacher);
	}
}

//both class can exist independently,
//hence inner class has to be created outside this class
//even if we loose reference of collect it should not kill instance of employee
//G.C should not kill the other one
class College {

	private String name;

	// lets get the has a object from outside
	private Principal teacher;

	public College(String name, Principal teacher) {
		this.name = name;
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "College [name=" + name + ", teacher=" + teacher + "]";
	}
	
}

class Principal {
	private String name;
	private String subject;
	private double salary;

	public Principal(String name, String subject, double salary) {
		this.name = name;
		this.subject = subject;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", subject=" + subject + ", salary=" + salary + "]";
	}

}
