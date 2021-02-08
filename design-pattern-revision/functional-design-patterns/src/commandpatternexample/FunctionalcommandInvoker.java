package commandpatternexample;

public class FunctionalcommandInvoker {

	private FunctionalCommand command;

	public FunctionalcommandInvoker(FunctionalCommand command) {
		this.command = command;
	}
	
	public void execute() {
		command.execute();
	}
	
}
