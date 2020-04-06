package doubleCheckedLocking;

public class LockedSingletonClone implements Cloneable{

	@Override
	public Object clone() throws CloneNotSupportedException {
		//we could have thrown an excption also if we eanted
		//but here we are returning same instance
		return instance;
	}
	private LockedSingletonClone() {}
	
	private static volatile LockedSingletonClone instance = null;
	
	//some configuration data with default value
	private int data=23;
	
	public static  LockedSingletonClone getInstance() {
		if(instance == null) {
			synchronized (LockedSingleton.class) {
				if(instance == null) {
					instance = new LockedSingletonClone();
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
