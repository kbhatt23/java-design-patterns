package profileExample;


public class Profile implements ProfileInterface{
	
	protected String firstName;
	protected String lastName;
	//can have any number of property
	
	
	
	protected Profile(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Override
	public void  printName() {
		System.out.println(firstName + " "+ lastName); 
	}

	@Override
	public String toString() {
		return "Profile [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
}
