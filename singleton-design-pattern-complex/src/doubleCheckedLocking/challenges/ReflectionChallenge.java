package doubleCheckedLocking.challenges;

import java.lang.reflect.Constructor;

import doubleCheckedLocking.LockedSingleton;

//we can solve this issue by creating enum
public class ReflectionChallenge {

	public static void main(String[] args) {
		 LockedSingleton instance1 = LockedSingleton.getInstance(); 
		 LockedSingleton instance2 = null; 
	        try
	        { 
	            Constructor[] constructors =  
	            		LockedSingleton.class.getDeclaredConstructors(); 
	            for (Constructor constructor : constructors)  
	            { 
	                // Below code will destroy the singleton pattern 
	                constructor.setAccessible(true); 
	                instance2 = (LockedSingleton) constructor.newInstance(); 
	                break; 
	            } 
	        } 
	      
	        catch (Exception e)  
	        { 
	            e.printStackTrace(); 
	        } 
	          
	    System.out.println("instance1.hashCode():- " 
	                                      + instance1.hashCode()); 
	    System.out.println("instance2.hashCode():- " 
	                                      + instance2.hashCode()); 
	}

}
