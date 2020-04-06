package lazyEvaluation;


public class LazySingletonClient {
public static void main(String[] args) {
	LazySingleton s = LazySingleton.getInstance();
	
	System.out.println("first time instance "+s.hashCode());
	System.out.println("first time instance data "+s.getData());
	s.setData(99);
	
	s =null;
	s= LazySingleton.getInstance();
	System.out.println("second time instance "+s.hashCode());
	System.out.println("second time instance data "+s.getData());
	
	
}

}
