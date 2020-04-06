package usingComposition;

public class NewLogic implements INewLogic {

	@Override
	public String evaluateLogic(String input) {
		return input.toLowerCase();
	}

}
