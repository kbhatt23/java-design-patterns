package lazyInitWithThreads;

import java.io.Serializable;

public class LazyInitClass implements Serializable{
	private LazyInitClass(){
		
	}
	private  volatile static LazyInitClass instance;
	
	//not thread safe
	public LazyInitClass getInstance() {
		if(instance == null) {
			instance = new LazyInitClass();
		}
		return instance;
	}
	
	//thread safe
	//performance hit synchornized on method level
	//dobule checked locking
	public /* synchronized */ static LazyInitClass  getInstanceThreadSafe() {
		//first if is for perfrroamce betterment
		//once object got created no need to synchronize and stop other threads to read
		if(instance == null) {
			synchronized (LazyInitClass.class) {
				if(instance == null) {
					instance = new LazyInitClass();
				}
			}
			
		}
		return instance;
	}
	
	//readResoolve to solve issue with serialization
	// implement readResolve method 
    private Object readResolve() 
    { 
        return instance; 
    } 

}
