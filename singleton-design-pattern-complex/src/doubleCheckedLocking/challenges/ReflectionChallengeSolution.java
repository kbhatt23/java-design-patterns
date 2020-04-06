package doubleCheckedLocking.challenges;

import java.lang.reflect.Constructor;

import doubleCheckedLocking.LockedSingleton;

//we can solve this issue by creating enum
//as enums have private hidden constructor
//so exception will occur if we try to call constructor using reflection
public class ReflectionChallengeSolution {

	public static void main(String[] args) {
		EnumSingleton instance1 = EnumSingleton.INSTANCE; 
		EnumSingleton instance2 = null; 
	        try
	        { 
	            Constructor[] constructors =  
	            		EnumSingleton.class.getDeclaredConstructors(); 
	            for (Constructor constructor : constructors)  
	            { 
	                // Below code will destroy the singleton pattern 
	                constructor.setAccessible(true); 
	                instance2 = (EnumSingleton) constructor.newInstance(); 
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
