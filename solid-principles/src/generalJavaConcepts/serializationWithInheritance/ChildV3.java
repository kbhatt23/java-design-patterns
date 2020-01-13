package generalJavaConcepts.serializationWithInheritance;

import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//class with super class serialiozed
public class ChildV3 extends ParentWithSerialization {
	
	private int childProperty;
	public ChildV3(int childProperty,int parentProperty) {
		super(parentProperty);
		this.childProperty = childProperty;
	}
	public int getChildProperty() {
		return childProperty;
	}
	public void setChildProperty(int childProperty) {
		this.childProperty = childProperty;
	}
	
	  // By implementing writeObject method,  
    // we can prevent 
    // subclass from serialization 
    private void writeObject(ObjectOutputStream out) throws IOException 
    { 
        throw new NotSerializableException(); 
    } 
      
    // By implementing readObject method,  
    // we can prevent 
    // subclass from de-serialization 
    private void readObject(ObjectInputStream in) throws IOException 
    { 
        throw new NotSerializableException(); 
    }
}
