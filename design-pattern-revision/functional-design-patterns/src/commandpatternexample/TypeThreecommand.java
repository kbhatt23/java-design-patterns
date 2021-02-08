package commandpatternexample;

public class TypeThreecommand implements FunctionalCommand{

	private String value;
	private FunctionalCommadnUtil util;
	
	public TypeThreecommand(String value, FunctionalCommadnUtil util) {
		this.value = value;
		this.util = util;
	}

	@Override
	public void execute() {
		util.typethreeManipulation(value);
	}

}
