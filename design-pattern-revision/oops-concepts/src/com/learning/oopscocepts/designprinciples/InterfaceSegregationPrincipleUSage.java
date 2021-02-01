package com.learning.oopscocepts.designprinciples;

//extends should only be used when we need to have substitutability
//meaning if there is a command method which take A,B or C and have same behavior, then we can make B and x extends A
//reusability without substitability we should use delegation/composistion/aggregation
public class InterfaceSegregationPrincipleUSage {
	public static void main(String[] args) {
		goodApproach();
		badApproach();

	}

	private static void goodApproach() {
		IBirdV2 sparrowNew = new SparrowV2();
		substutabilityCodeNoise(sparrowNew);
		// sparrow can even fly
		IFlyable flyable = (IFlyable) sparrowNew;
		substutabilityCodeFly(flyable);

		IBirdV2 ostrichNEw = new OstrichV2();
		substutabilityCodeNoise(ostrichNEw);

		// ostrich can not fly

	}

	private static void badApproach() {
		IBirdV1 sparrow = new SparrowV1();
		IBirdV1 ostrich = new OstrichV1();
		substutabilityCode(sparrow);
		substutabilityCode(ostrich);
	}

	private static void substutabilityCode(IBirdV1 sparrow) {
		System.out.println("substitutability started for " + sparrow);
		// sparrow.makeNoise();
		sparrow.fly();
		sparrow.makeNoise();
	}

	private static void substutabilityCodeNoise(IBirdV2 sparrow) {
		System.out.println("substitutabilitynoise started for " + sparrow);
		// sparrow.makeNoise();
		// bird can do at least makenise, not neccessary it can fly
		// sparrow.fly();
		sparrow.makeNoise();
	}

	private static void substutabilityCodeFly(IFlyable flyable) {
		System.out.println("substitutabilityflyable started for " + flyable);
		// sparrow.makeNoise();
		// bird can do at least makenise, not neccessary it can fly
		// sparrow.fly();
		// can not make noise
		// flyable.makeNoise();
		flyable.fly();
	}

}

//assuming all birds can fly
//bad apprach, as some bird can not fly, so we have to throw illegalstateexception
interface IBirdV1 {
	public void fly();

	public void makeNoise();
}

class SparrowV1 implements IBirdV1 {

	@Override
	public void fly() {
		System.out.println("sparrow flying");
	}

	@Override
	public void makeNoise() {
		System.out.println("sparrow making noise");
	}

}

class OstrichV1 implements IBirdV1 {

	// unnecessary class had to implement, should have been segregated
	@Override
	public void fly() {
		throw new IllegalStateException("Ostrich can not fly");
	}

	@Override
	public void makeNoise() {
		System.out.println("ostrich making noise");
	}

}

interface IFlyable {
	public void fly();
}

//better seggreageted
interface IBirdV2 {

	public void makeNoise();
}

//good one have sperate seggreagated interfaces
class SparrowV2 implements IBirdV2, IFlyable {

	@Override
	public void fly() {
		System.out.println("sparrow flying");
	}

	@Override
	public void makeNoise() {
		System.out.println("sparrow making noise");
	}

}

//implemnt only needed interfaces
class OstrichV2 implements IBirdV2 {
	// can not fly so no need to implement fluavble interface

//	@Override
//	public void fly() {
//		throw new IllegalStateException("Ostrich can not fly");
//	}

	@Override
	public void makeNoise() {
		System.out.println("ostrich making noise");
	}

}
