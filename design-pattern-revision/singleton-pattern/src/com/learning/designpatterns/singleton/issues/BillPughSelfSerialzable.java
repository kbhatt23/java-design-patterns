package com.learning.designpatterns.singleton.issues;

import java.io.Serializable;

public class BillPughSelfSerialzable implements Serializable,Cloneable{

	private BillPughSelfSerialzable() {
		
	}
	
	static {
		System.out.println("jai shree ram from main class");
	}
	
	//we know static inner class is lazy , initialzed only when called
	private static class InstanceLoader{
		//startic inner class can access the main class's static things only
		private static BillPughSelfSerialzable INSTANCE = new BillPughSelfSerialzable();
		
		static {
			System.out.println("jai shree ram from inner class");
		}
	}
	
	//static field of class need not create object
	public static BillPughSelfSerialzable getInstance() {
		return InstanceLoader.INSTANCE;
	}
	
	// solve singleton issue with serialzation
    protected Object readResolve() 
    { 
        return InstanceLoader.INSTANCE; 
    } 
    
    @Override
    public BillPughSelfSerialzable clone() throws CloneNotSupportedException{
    	//return (BillPughSelfSerialzable)super.clone();
    	//for singleton save the isntance
    	return InstanceLoader.INSTANCE; 
    }
}
