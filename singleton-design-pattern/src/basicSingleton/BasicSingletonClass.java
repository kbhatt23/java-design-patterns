package basicSingleton;

import java.io.Serializable;

public class BasicSingletonClass implements Serializable{
	//eager initializqtion
	private static final BasicSingletonClass instance = new BasicSingletonClass(23);
	private int property1;

	private  BasicSingletonClass(int property1) {
		this.property1 = property1;
	}
	
	
	public int getProperty1() {
		return property1;
	}

	public void setProperty1(int property1) {
		this.property1 = property1;
	}
	
	public static BasicSingletonClass getInstance() {
		return instance;
	}
	
	// implement readResolve method 
    private Object readResolve() 
    { 
        return instance; 
    } 
	

}
