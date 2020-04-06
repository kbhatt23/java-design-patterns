package doubleCheckedLocking;

import java.io.Serializable;

public class LockedSingleton implements Cloneable , Serializable{

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	private LockedSingleton() {}
	
	private static volatile LockedSingleton instance = null;
	
	//some configuration data with default value
	private int data=23;
	
	public static  LockedSingleton getInstance() {
		if(instance == null) {
			synchronized (LockedSingleton.class) {
				if(instance == null) {
					instance = new LockedSingleton();
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
