package com.learning.designpatterns.builder;

//only way to create builder is static method of main class
//onyl way to create object of main class si via builder
//greate defencisve coding

//builder pattern
public class ImmutableUser {
	// so many fields with same/similar data type, making documentation tough
	private int id;
	private String name;
	private int age;
	private double salary;

	// should not be allowed for any new class to create object
	private ImmutableUser(int id, String name, int age, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	// immutable and hence no need to create setters only getters are enough

	// private: no other class can access it
	// static: no need to create outer class object before creating this class

	@Override
	public String toString() {
		return "ImmutableUser [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
//mandtory p[roeprties
	//only wayto create builder is by this static method
	public static ImmutableUserBuilder builder(int id, String name) {
		return new ImmutableUserBuilder(id, name);
	}

	public static class ImmutableUserBuilder {
		private int id;
		private String name;
		private int age;
		private double salary;

		// making id and name mandatory, if not we could have used no arg constructor
		private ImmutableUserBuilder(int id, String name) {
			this.id = id;
			this.name = name;
		}

		// optinal proeprties
		public ImmutableUserBuilder setAge(int age) {
			this.age = age;
			return this;
		}

		public ImmutableUserBuilder setSalary(double salary) {
			this.salary = salary;
			return this;
		}

		// one time work and other dev need not to creat the object again and again and
		// cahnces of mistakes are there
		public ImmutableUser build() {
			//good place for validation of mandatory data, correct possible values
			if(!validateItems()) {
				throw new IllegalStateException("State is not correct");
			}
			return new ImmutableUser(id, name, age, salary);
		}

		private boolean validateItems() {
			//mandatory field values are checked
			//also we can check values of other fields which are not amndatory
			return this.id > 0 && this.name != null && this.name.length() > 0 /* && this.salary > 1 */; 
		}
	}

}
