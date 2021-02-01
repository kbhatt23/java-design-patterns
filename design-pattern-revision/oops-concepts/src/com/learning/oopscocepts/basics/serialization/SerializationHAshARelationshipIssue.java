package com.learning.oopscocepts.basics.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationHAshARelationshipIssue {
	public static void main(String[] args) {
		SerializationHasAIssues object = new SerializationHasAIssues(11, "sita-ram", new NonSerialzableClass(22, "radhe-krishna"));
		System.out.println("oject to serailize "+object);
		System.out.println("initial hashcode "+object.hashCode());
//serialze
		try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("fake.ser"))){
			outputStream.writeObject(object);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		//deserialize
		try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("fake.ser"))){
			Object readObject = inputStream.readObject();
			System.out.println("deserialized object "+readObject);
			System.out.println("final hashcode "+readObject.hashCode());
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
