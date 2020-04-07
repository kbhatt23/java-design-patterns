package filesystemExample;

public class FileSystemInvoker {

	private Command command;

	public FileSystemInvoker(Command command) {
		this.command = command;
	}
	
	public void execute() {
		command.execute();
	}
	
	
}
