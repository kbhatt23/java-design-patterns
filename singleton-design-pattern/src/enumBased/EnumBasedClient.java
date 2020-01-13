package enumBased;

import java.lang.reflect.Constructor;

import serializationUtil.MultiThreadUtil;
import serializationUtil.SerializationUtil;

public class EnumBasedClient {
	public static void main(String[] args) {
		EnumBasedClass ka =EnumBasedClass.INSTANCE;
		
		ka.testFunction();
		System.out.println(ka.getName());
		ka.setName("krishna kanhayya");
		
		EnumBasedClass ka1 =EnumBasedClass.INSTANCE;
		System.out.println(ka1.getName());
		
		/*
		 * EnumBasedClass instance2 =null; try { Constructor[] constructors =
		 * EnumBasedClass.class.getDeclaredConstructors(); for (Constructor constructor
		 * : constructors) { // Below code will destroy the singleton pattern
		 * constructor.setAccessible(true); instance2 = (EnumBasedClass)
		 * constructor.newInstance(); break; } }
		 * 
		 * catch (Exception e) { e.printStackTrace(); }
		 * 
		 * System.out.println(instance2 == ka);
		 */
		
		SerializationUtil.serializeObject(ka, "enumSingleton.txt");
		MultiThreadUtil.sleep(500);
		ka.setName("nand ke krishna");
		EnumBasedClass ka2 = (EnumBasedClass)SerializationUtil.deserializeObject("enumSingleton.txt");
		System.out.println(ka2 == ka);
		System.out.println(ka2.getName());
		System.out.println(ka.getName());
	}
}
