package billPugh;

public class BillPughSingleton {

	private BillPughSingleton() {}
	
	//we can use concept of eager initialziaton here so that synchronized thins whihc are complez can be skipped in implementaion
	//in case of static inner class onlywe can use static varible,
	//in case of non staic inner class we cna not use static variable, and hence eager initializtion can not be used
	//we use bill pugh to solve multiple synchornization things that wr solved earlier
	//to not load staitc varialble we are using inner class so that we can do things lazily wihtout synchronization challenges
	//private calss wont be accessed by outside members
	private static class BillPughSingletonFactory{
		//below will be lazily evaulated as innernclass static variales are not loaded while class loads by JVM
		private static BillPughSingleton instance= new BillPughSingleton();
	}
	
	public static BillPughSingleton getInstance() {
		return BillPughSingletonFactory.instance;
	}
}
