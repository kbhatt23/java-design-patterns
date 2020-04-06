package doubleCheckedLocking;


public class LockedSingletonClient {
public static void main(String[] args) {
	LockedSingleton s = LockedSingleton.getInstance();
	
	System.out.println("first time instance "+s.hashCode());
	System.out.println("first time instance data "+s.getData());
	s.setData(99);
	
	s =null;
	s= LockedSingleton.getInstance();
	System.out.println("second time instance "+s.hashCode());
	System.out.println("second time instance data "+s.getData());
	
	
}

}
