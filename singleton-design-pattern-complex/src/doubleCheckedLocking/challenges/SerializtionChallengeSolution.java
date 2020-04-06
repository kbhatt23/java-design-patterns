package doubleCheckedLocking.challenges;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import doubleCheckedLocking.LockedSingleton;
import doubleCheckedLocking.LockedSingletonSerialzable;

public class SerializtionChallengeSolution {
public static void main(String[] args) {
	try
    { 
		LockedSingletonSerialzable instance1 = LockedSingletonSerialzable.getInstance(); 
        ObjectOutput out 
            = new ObjectOutputStream(new FileOutputStream("file.text")); 
        out.writeObject(instance1); 
        out.close(); 
  
        // deserailize from file to object 
        ObjectInput in  
            = new ObjectInputStream(new FileInputStream("file.text")); 
          
        LockedSingletonSerialzable instance2 = (LockedSingletonSerialzable) in.readObject(); 
        in.close(); 
  
        System.out.println("instance1 hashCode:- "
                                             + instance1.hashCode()); 
        System.out.println("instance2 hashCode:- " 
                                             + instance2.hashCode()); 
    }  
      
    catch (Exception e)  
    { 
        e.printStackTrace(); 
    } 
}
}
