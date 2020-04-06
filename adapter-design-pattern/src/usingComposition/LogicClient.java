package usingComposition;

public class LogicClient {

	public static void main(String[] args) {
		String input = "jai shree ram";
		IExistingLogic existingLogic = new ExistingLogic();
		
		String output =  printLogic(existingLogic, input);
		
		LogicAdapter newLogic = new LogicAdapter(new NewLogic());
		printLogic(newLogic, output);
	}
	
	public static String  printLogic(IExistingLogic logic, String input) {
		System.out.println(logic.manipulateLogic(input));
		return logic.manipulateLogic(input);
	}

}
