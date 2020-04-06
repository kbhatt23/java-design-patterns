package doubleCheckedLocking.challenges;

import doubleCheckedLocking.LockedSingletonClone;

public class CloneableChallengeSolution {

	public static void main(String[] args) {
		LockedSingletonClone instance1 = LockedSingletonClone.getInstance();
		
		try {
			LockedSingletonClone instance2 = (LockedSingletonClone) instance1.clone();
			System.out.println("instance1 "+instance1.hashCode());
			System.out.println("instance2 "+instance2.hashCode());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
