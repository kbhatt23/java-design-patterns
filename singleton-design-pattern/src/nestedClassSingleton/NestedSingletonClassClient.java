package nestedClassSingleton;

import lazyInitWithThreads.LazyInitClass;
import serializationUtil.MultiThreadUtil;
import serializationUtil.SerializationUtil;

public class NestedSingletonClassClient {

	public static void main(String[] args) {
		NestedSingletonClass nestedsingleton = NestedSingletonClass
												.getInstance();
		
		SerializationUtil.serializeObject(nestedsingleton,"nestedSingleton.txt");
		MultiThreadUtil.sleep(400);
		NestedSingletonClass nestedsingletonClass1 = (NestedSingletonClass) SerializationUtil.deserializeObject("nestedSingleton.txt");
		System.out.println(nestedsingleton == nestedsingletonClass1);
	}

}
