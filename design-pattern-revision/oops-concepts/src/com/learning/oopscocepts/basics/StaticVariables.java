package com.learning.oopscocepts.basics;

public class StaticVariables {

	private static int staticVariable;
	private  int instancevariable;
	
	public static void main(String[] args) {
		System.out.println("default value of static variabls is "+StaticVariables.staticVariable);
		StaticVariables obj1 = new StaticVariables();
		StaticVariables obj2 = new StaticVariables();
		obj2.instancevariable=23;
		obj2.staticVariable=99;
		System.out.println("default value of instance variable is "+obj1.instancevariable);
		System.out.println("default value of instance variable is "+obj2.instancevariable);
		System.out.println("default value of static variabls is "+obj1.staticVariable);
		System.out.println("default value of static variabls is "+obj2.staticVariable);
	}
}
