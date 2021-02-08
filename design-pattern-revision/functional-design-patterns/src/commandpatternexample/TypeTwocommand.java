package commandpatternexample;

public class TypeTwocommand implements FunctionalCommand{

	private double value;
	private FunctionalCommadnUtil util;
	
	public TypeTwocommand(double value, FunctionalCommadnUtil util) {
		this.value = value;
		this.util = util;
	}

	@Override
	public void execute() {
		util.typeTwoManipulation(value);
	}

}
