package com.learning.oopscocepts.designprinciples;

//DRY means do not repeat yourself
//never put same block of code /logic at two different places, what if the logic changes 
//then we must make change in both/all places ad there will be chances of missing some place
public class DRYPrincipleUsage {

	public static void main(String[] args) {
		boolean isWhiteCloth = false;
		if (isWhiteCloth)
			washWhiteclothes();
		else
			washColoredclothes();
	}

	public static void washWhiteclothes() {
		// pre functionality will remain same for all clothes
		//lets say in future functionlaity changes, then we must change at all repeated places
			// -> rework, chances of missing at some place, more bugs, tough to replicate the bug
		//lets move to amnother method
		preMachineSetup();

		System.out.println("wash white clothes");

		postMachineSetup();
	}

	private static void postMachineSetup() {
		// post functionality will remain same for all clothes
		
		//adding below new feature
		System.out.println("reset the config");
				
		System.out.println("Dry the clothes");
		
		
		System.out.println("Powering off machine");
		
	}

	private static void preMachineSetup() {
		System.out.println("Powering on machine");
		System.out.println("Setup the basic configuration");
	}

	public static void washColoredclothes() {
		preMachineSetup();

		System.out.println("wash colored clothes");

		postMachineSetup();
	}

}
