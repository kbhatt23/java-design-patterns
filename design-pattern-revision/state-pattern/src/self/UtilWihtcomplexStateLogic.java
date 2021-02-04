package self;

public class UtilWihtcomplexStateLogic {

	// state could be even more complex, just for demo i am giving simple condition
	private boolean stateOne;

	private boolean stateTwo;

	private boolean stateThree;

	public UtilWihtcomplexStateLogic(boolean stateOne, boolean stateTwo, boolean stateThree) {
		this.stateOne = stateOne;
		this.stateTwo = stateTwo;
		this.stateThree = stateThree;
	}

	// based on state manipulation happens differently

	public void manipulate() {
		System.out.println("Manipulation Logic Starts");

		//too many complex logic
		//tight couplig based on state
		//in future if new state condition comes the class needs to be modified
		//for open close principle it is not good
		if (stateOne) {
			// complex logic
			System.out.println("Logic for maipulation is handled by stateOne");
		} else if (stateTwo) {
			// complex logic
			System.out.println("Logic for maipulation is handled by stateTwo");
		} else if (stateThree) {
			// complex logic
			System.out.println("Logic for maipulation is handled by stateThree");
		} else {
			throw new IllegalStateException("We do not suppor this state");
		}
		
		System.out.println("Manipulation Logic Ends");
	}

}
