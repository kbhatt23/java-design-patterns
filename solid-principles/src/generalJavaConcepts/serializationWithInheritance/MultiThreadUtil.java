package generalJavaConcepts.serializationWithInheritance;

public class MultiThreadUtil {
public static void sleep(long ms) {
	try {
		Thread.sleep(ms);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
