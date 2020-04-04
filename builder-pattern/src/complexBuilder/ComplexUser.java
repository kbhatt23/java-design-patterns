package complexBuilder;

public class ComplexUser {

	private String firstName;
	
	private String lastName;
	//optional
	private String nickName;
	
	private int age;
	
	private String address;
	
	//private constructor to force client to use pattern
	private ComplexUser() {}
	//private constructor to force client to use pattern
	private ComplexUser(ComplexUserBuilder complexUserBuilder) {
		this.firstName = complexUserBuilder.firstName;
		this.lastName = complexUserBuilder.lastName;
		this.age = complexUserBuilder.age;
		this.nickName = complexUserBuilder.nickName;
		this.address = complexUserBuilder.address;
	}
//class is made static because otherwise we would need to create main class
	//to again call constructor of child class
	//we made main class constructor as private to enforce contract
	public static class ComplexUserBuilder{
		
		private String firstName;
		
		private String lastName;
		//optional
		private String nickName;
		
		private int age;
		
		private String address;

		public ComplexUserBuilder setFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public ComplexUserBuilder setLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public ComplexUserBuilder setNickName(String nickName) {
			this.nickName = nickName;
			return this;
		}

		public ComplexUserBuilder setAge(int age) {
			this.age = age;
			return this;
		}

		public ComplexUserBuilder setAddress(String address) {
			this.address = address;
			return this;
		}
		
		public ComplexUser build() {
			return new ComplexUser(this);
		}
	}
	//not creating setter as for builder patter we already do complex thing to create object
		//as of duplication we assume client already provided neccessary data to create object
		//hence builder patter assumes that client wont mutate instance variable after
		//creation of object is done using builder method
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getNickName() {
		return nickName;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "ComplexUser [firstName=" + firstName + ", lastName=" + lastName + ", nickName=" + nickName + ", age="
				+ age + ", address=" + address + "]";
	}
	
	
	
}
