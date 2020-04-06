package usingComposition;

public class ExistingLogic implements IExistingLogic{

	@Override
	public String manipulateLogic(String input) {
		return input.toUpperCase();
	}

}
