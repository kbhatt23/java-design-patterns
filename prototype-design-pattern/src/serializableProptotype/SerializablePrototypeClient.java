package serializableProptotype;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class SerializablePrototypeClient {
public static void main(String[] args) {
	System.out.println("procrssprs "+Runtime.getRuntime().availableProcessors());
	Address address = new Address("delhi", 110075, "c502 majestic apratment");
	Employee employee = new Employee(23, "hanuman", address);
	System.out.println("main class is "+employee);
	
	//instead of cloning or copy constructoir
	//we are using serialoztion whihc is easy
	serializeObject(employee);
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	FileInputStream fi;
	try {
		fi = new FileInputStream(new File("kanishk.txt"));
		ObjectInputStream oi = new ObjectInputStream(fi);
		Employee newempl = (Employee)oi.readObject();
		newempl.setAge(1000);
		newempl.getAddress().setCity("kalinga");
		System.out.println("new obkject is "+newempl);
		System.out.println("main class is "+employee);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
			
}

private static void serializeObject(Employee employee) {
	try {
		FileOutputStream fi = new FileOutputStream(new File("kanishk.txt"));
		ObjectOutputStream oi = new ObjectOutputStream(fi);
		
		oi.writeObject(employee);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
