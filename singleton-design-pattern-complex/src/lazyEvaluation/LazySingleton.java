package lazyEvaluation;

public class LazySingleton {

	private LazySingleton() {}
	
	private static LazySingleton instance = null;
	
	//some configuration data with default value
	private int data=23;
	
	public static synchronized LazySingleton getInstance() {
		if(instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}
