package enumBased;

public class MonoStateClient {

	public static void main(String[] args) {

		MonoStateClass obj1 = new MonoStateClass();
		obj1.setAge(23);
		obj1.setName("raghupati");
		
		MonoStateClass obj2 = new MonoStateClass();
		System.out.println("name is "+obj2.getName() + " age is "+obj2.getAge());
		System.out.println(obj1 == obj2);
	
	}

}
