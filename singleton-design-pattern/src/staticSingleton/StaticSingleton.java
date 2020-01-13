package staticSingleton;

import java.io.File;

//in case a construcotr throw3sn exception code will break with niormal approach
//here in static block we can try catch
//below is still eager init
public class StaticSingleton {
	private StaticSingleton() throws Exception{
		File file = new File("...");
		boolean isEx = true;
		if(isEx) {
			throw new Exception("jai shree ram and rama duta");
		}
	}
	//below will cause compilation issue , also code wil break on runtime exception
	//private static final StaticSingleton instance=new StaticSingleton();
	private static  StaticSingleton instance;
	
	  static {
		  System.out.println("jai mahablai hanuman ");
		  try {
			instance= new StaticSingleton();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		  }
	  
	  public static StaticSingleton getInstance() {
		  return instance;
	  }
	 
}
