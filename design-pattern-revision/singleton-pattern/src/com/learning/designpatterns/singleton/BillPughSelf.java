package com.learning.designpatterns.singleton;

public class BillPughSelf {

	private BillPughSelf() {
		
	}
	
	static {
		System.out.println("jai shree ram from main class");
	}
	
	//we know static inner class is lazy , initialzed only when called
	private static class InstanceLoader{
		//startic inner class can access the main class's static things only
		private static BillPughSelf INSTANCE = new BillPughSelf();
		
		static {
			System.out.println("jai shree ram from inner class");
		}
	}
	
	//static field of class need not create object
	public static BillPughSelf getInstance() {
		return InstanceLoader.INSTANCE;
	}
}
