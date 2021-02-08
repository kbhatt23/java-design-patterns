package commandpatternexample;

public class FunctionalCommandClient {
	public static void main(String[] args) {

		FunctionalCommadnUtil util = new FunctionalCommadnUtil();
		
		//int value=11;
		//double value=11;
		String value = "jai shree ram";
		
		//could be using factory
		//FunctionalCommand command = new TypeOnecommand(11, util);
		
		//FunctionalCommand command = new TypeTwocommand(11.11, util);
		
		//using lambda we can save creating so many subclass
		//as in command we anyway redirect to reciever
		//any new unctioanloty can be added in invoker, so creating class for command is useless
		//FunctionalCommand command = new TypeThreecommand("jai shree ram", util);
		//just redirect to util appropraite method , no need to classes
		//this saves creating object utill needed 
	
//		FunctionalCommand command = 
//					() -> util.typeOneManipulation(value);
		
		FunctionalCommand command = 
				() -> util.typethreeManipulation(value);
		
		//segreation of concern
		//can add to quue to make async
		//can add functionaliotues like do redo undo
		FunctionalcommandInvoker invoker = new FunctionalcommandInvoker(command);
		invoker.execute();
	}
}
