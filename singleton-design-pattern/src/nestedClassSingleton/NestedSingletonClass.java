package nestedClassSingleton;

import java.io.Serializable;

public class NestedSingletonClass implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7873611305090891527L;

	private NestedSingletonClass() {
		
	}
	
	private static class NestedSingletonClassFactory{
		//final variables can either be eager initialized
		
		private static final NestedSingletonClass instance = new NestedSingletonClass();
	}
	
	//readResoolve to solve issue with serialization
	// implement readResolve method 
    private Object readResolve() 
    { 
        return NestedSingletonClassFactory.instance;
    } 
    
    public static NestedSingletonClass getInstance(){
    	  return NestedSingletonClassFactory.instance;
    }
    	


}
