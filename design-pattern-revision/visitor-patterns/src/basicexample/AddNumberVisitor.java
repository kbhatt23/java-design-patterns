package basicexample;

public class AddNumberVisitor implements NumberVisitor{

	//we could have 3 or 4 number visitor class also
	@Override
	public int visit(NumberManipulationVisitable numberManipulationVisitable) {
		
		return numberManipulationVisitable.getNumber1() + numberManipulationVisitable.getNumber2();
	}

	@Override
	public int visit(ThreeNumberManipulationVisitable numberManipulationVisitable) {
		return numberManipulationVisitable.getNumber1()+numberManipulationVisitable.getNumber2()+numberManipulationVisitable.getNumber3();
	}

}
