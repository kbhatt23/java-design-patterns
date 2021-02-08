package strategyexample;

import java.util.Arrays;
import java.util.List;

public class Human {

	private String name;
	
	private String country;
	
	private int age;

	public Human(String name, String country, int age) {
		super();
		this.name = name;
		this.country = country;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	public static List<Human> createHumans(){
		Human h1 = new Human("rahul", "India",50 );
		Human h2 = new Human("kejriwal", "India",50 );
		
		Human h3 = new Human("kanishk", "India",29 );
		
		Human h4 = new Human("messi", "Argentina",33 );
		
		Human h5 = new Human("aguero", "Argentina",33 );
		Human h6 = new Human("neymar", "Argentina",29 );
		Human h7 = new Human("ronaldinho", "Brazil", 42 );
		return Arrays.asList(h1,h2,h3,h4,h5,h6,h7);
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", country=" + country + ", age=" + age + "]";
	}
	
	
	
}
