package sampleBuilder;

public class BigProfile {
	private String firstName;
	private String lastName;
	private int age;
	private boolean footballFan;
	private BigProfile(BigProfileBuilder builder){
		this.firstName =builder.firstName;
		this.lastName =builder.lastName;
		this.age =builder.age;
		this.footballFan =builder.footballFan;
	}
	
	static class BigProfileBuilder{
		private String firstName;
		private String lastName;
		private int age;
		private boolean footballFan;
		
		//can add mandatory fields in constructor
		public BigProfileBuilder(String firstName) {
			this.firstName = firstName;
		}
		//non mandtory properties
		public BigProfileBuilder setLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		
		public BigProfileBuilder setAge(int age) {
			this.age=age;
			return this;
		}
		public BigProfileBuilder setFootballFan(boolean footballFan) {
			this.footballFan = footballFan;
			return this;
		}
		public BigProfile build() {
			return new BigProfile(this);
		}
	}

	@Override
	public String toString() {
		return "BigProfile [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", footballFan="
				+ footballFan + "]";
	}

	
}
