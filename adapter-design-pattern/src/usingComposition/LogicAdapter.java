package usingComposition;

public class LogicAdapter implements IExistingLogic{

	private INewLogic newLogic;
	@Override
	public String manipulateLogic(String input) {
		return newLogic.evaluateLogic(input);
	}
	public LogicAdapter(INewLogic newLogic) {
		this.newLogic = newLogic;
	}


}
