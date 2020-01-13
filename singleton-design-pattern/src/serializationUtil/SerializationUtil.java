package serializationUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationUtil {
	public static void serializeObject(Object object, String file) {
		try {
			FileOutputStream fi = new FileOutputStream(new File(file));
			ObjectOutputStream oi = new ObjectOutputStream(fi);
			
			oi.writeObject(object);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Object deserializeObject(String file) {
		FileInputStream fi;
		try {
			fi = new FileInputStream(new File(file));
			ObjectInputStream oi = new ObjectInputStream(fi);
			return oi.readObject();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
