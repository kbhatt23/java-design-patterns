package basicSingleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import serializationUtil.MultiThreadUtil;
import serializationUtil.SerializationUtil;


public class BasicSingletonClientSerializationIssue {
public static void main(String[] args) {
	BasicSingletonClass newc = BasicSingletonClass.getInstance();
	
	SerializationUtil.serializeObject(newc,"kanishk.txt");
	
	MultiThreadUtil.sleep(500);
	BasicSingletonClass newc1 = (BasicSingletonClass)SerializationUtil.deserializeObject("kanishk.txt");
	System.out.println(newc == newc1);
	
}


}
