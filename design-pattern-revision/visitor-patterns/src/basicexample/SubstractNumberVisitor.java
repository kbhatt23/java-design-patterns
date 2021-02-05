package basicexample;

public class SubstractNumberVisitor implements NumberVisitor {

	@Override
	public int visit(NumberManipulationVisitable numberManipulationVisitable) {
		return numberManipulationVisitable.getNumber1() - numberManipulationVisitable.getNumber2();
	}

	@Override
	public int visit(ThreeNumberManipulationVisitable numberManipulationVisitable) {
		return numberManipulationVisitable.getNumber1() - numberManipulationVisitable.getNumber2()
				-numberManipulationVisitable.getNumber3();
	}

}
