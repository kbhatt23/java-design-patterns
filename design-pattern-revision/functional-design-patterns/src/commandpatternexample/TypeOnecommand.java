package commandpatternexample;

public class TypeOnecommand implements FunctionalCommand{

	private int value;
	private FunctionalCommadnUtil util;
	
	public TypeOnecommand(int value, FunctionalCommadnUtil util) {
		super();
		this.value = value;
		this.util = util;
	}

	@Override
	public void execute() {
		util.typeOneManipulation(value);
	}

}
