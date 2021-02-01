package com.learning.designpatterns.singleton.issues;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonCloneIssue {
	public static void main(String[] args) throws CloneNotSupportedException {

		BillPughSelfSerialzable object = BillPughSelfSerialzable.getInstance();
		System.out.println("initial object " + object);
		System.out.println("initial hashcode " + object.hashCode());

		BillPughSelfSerialzable clone = object.clone();
		System.out.println("final object " + clone);
		System.out.println("final hashcode " + clone.hashCode());
	}
}
