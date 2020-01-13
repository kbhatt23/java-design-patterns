package basicSingleton;

public class BasicSingletonClient {

	public static void main(String[] args) {
		//BasicSingletonClass newc = new BasicSingletonClass();
		
		BasicSingletonClass newc = BasicSingletonClass.getInstance();
		System.out.println("init value is "+newc.getProperty1());
		
		newc.setProperty1(99);
		
		BasicSingletonClass newc1 = BasicSingletonClass.getInstance();
		System.out.println("new val from another object is "+newc1.getProperty1());
		System.out.println(newc == newc1);
		
		
	}

}
