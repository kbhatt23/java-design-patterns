package lazyInitWithThreads;

import serializationUtil.MultiThreadUtil;
import serializationUtil.SerializationUtil;

public class LazyInitclient {

	public static void main(String[] args) {

		LazyInitClass singletonClass= LazyInitClass.getInstanceThreadSafe();
		
		SerializationUtil.serializeObject(singletonClass,"lazySingleton.txt");
		MultiThreadUtil.sleep(400);
		LazyInitClass singletonClass1 = (LazyInitClass) SerializationUtil.deserializeObject("lazySingleton.txt");
		System.out.println(singletonClass1==singletonClass);
	}

}
