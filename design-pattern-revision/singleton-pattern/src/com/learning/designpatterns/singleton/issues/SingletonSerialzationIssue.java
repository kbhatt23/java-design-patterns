package com.learning.designpatterns.singleton.issues;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonSerialzationIssue {
	public static void main(String[] args) {

		BillPughSelfSerialzable object = BillPughSelfSerialzable.getInstance();
		System.out.println("oject to serailize " + object);
		System.out.println("initial hashcode " + object.hashCode());
//serialze
		try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("fake1.ser"))) {
			outputStream.writeObject(object);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// deserialize
		try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("fake1.ser"))) {
			Object readObject = inputStream.readObject();
			System.out.println("deserialized object " + readObject);
			System.out.println("final hashcode " + readObject.hashCode());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}