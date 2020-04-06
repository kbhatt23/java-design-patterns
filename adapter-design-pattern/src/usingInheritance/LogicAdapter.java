package usingInheritance;

public class LogicAdapter implements IExistingLogic , INewLogic{

	@Override
	public String manipulateLogic(String input) {
		// TODO Auto-generated method stub
		return evaluateLogic(input);
	}

	@Override
	public String evaluateLogic(String input) {
		// TODO Auto-generated method stub
		return input.toLowerCase();
	}

}
