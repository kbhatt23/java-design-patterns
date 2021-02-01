package com.learning.oopscocepts.designprinciples;

//extends should only be used when we need to have substitutability
//meaning if there is a command method which take A,B or C and have same behavior, then we can make B and x extends A
//reusability without substitability we should use delegation/composistion/aggregation
public class LiskovSubstitutionPrinciple {
	public static void main(String[] args) {
		Bird bird = new Bird();
		callSubstituabilityMethod(bird);
		callSubstituabilityMethod(new Sparrow());
	}
	//can take child of bird as well as bird object
	private static void callSubstituabilityMethod(Bird bird) {
		System.out.println("substitutability starts");
		bird.fly();
	}
}

class Bird {

	public void fly() {
		System.out.println("Bird flying");
	}
}

class Sparrow extends Bird {
	// can fly as well as doother things

	public void makeNoise() {
		System.out.println("sparrow ka cheh chahana");
	}
}
