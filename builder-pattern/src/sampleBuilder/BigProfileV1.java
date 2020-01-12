package sampleBuilder;

public class BigProfileV1 {
	private String firstName;
	private String lastName;
	private int age;
	@Override
	public String toString() {
		return "BigProfileV1 [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", footballFan="
				+ footballFan + "]";
	}
	private boolean footballFan;
	private BigProfileV1() {
		
	}
	private BigProfileV1(String firstName, String lastName, int age, boolean footballFan) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.footballFan = footballFan;
	}
	static class BigProfileBuilderV1{
		private BigProfileV1 mainClass=new BigProfileV1();
		
		public  BigProfileBuilderV1  addFirstName(String firstName) {
			mainClass.firstName = firstName;
			return this;
			
		}
		public  BigProfileBuilderV1  addLastName(String lastName) {
			mainClass.lastName = lastName;
			return this;
			
		}
		public  BigProfileBuilderV1  addage(int age) {
			mainClass.age = age;
			return this;
			
		}
		public  BigProfileBuilderV1  addFootballFan(boolean footballFan) {
			mainClass.footballFan = footballFan;
			return this;
			
		}
		
		public BigProfileV1 build() {
			return this.mainClass;
		}
	}


	
}
