package doubleCheckedLocking.challenges;

import doubleCheckedLocking.LockedSingleton;

public class CloneableChallenge {

	public static void main(String[] args) {
		LockedSingleton instance1 = LockedSingleton.getInstance();
		
		try {
			LockedSingleton instance2 = (LockedSingleton) instance1.clone();
			System.out.println("instance1 "+instance1.hashCode());
			System.out.println("instance2 "+instance2.hashCode());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
