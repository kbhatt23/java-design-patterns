package self;

public class UtilWihtcomplexStateLogicFix {

	//lets remove complex states and merge into one interface
	//	private boolean stateOne;
//
//	private boolean stateTwo;
//
//	private boolean stateThree;
	
	private ComplexState complexState;

	public UtilWihtcomplexStateLogicFix(ComplexState complexState) {
		this.complexState = complexState;
	}

	// based on state manipulation happens differently

	public void manipulate() {
		System.out.println("Manipulation Logic Starts");

		//all if else condition gone
		//logic is independent of complex states and its condition
		complexState.manipulate();		
		System.out.println("Manipulation Logic Ends");
	}

}
