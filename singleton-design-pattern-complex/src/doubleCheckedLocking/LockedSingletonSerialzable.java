package doubleCheckedLocking;

import java.io.Serializable;

public class LockedSingletonSerialzable implements Cloneable , Serializable{

	
	//to solve issue with serialization
	// implement readResolve method 
    protected Object readResolve() 
    { 
        return instance; 
    } 
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	private LockedSingletonSerialzable() {}
	
	private static volatile LockedSingletonSerialzable instance = null;
	
	//some configuration data with default value
	private int data=23;
	
	public static  LockedSingletonSerialzable getInstance() {
		if(instance == null) {
			synchronized (LockedSingleton.class) {
				if(instance == null) {
					instance = new LockedSingletonSerialzable();
				}
			}
			
					}
		return instance;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}
