package filesystemExample;

public class CreateFileCommand implements Command {
	private FileReciever fileReciever;
	public CreateFileCommand(FileReciever fileReciever) {
		this.fileReciever = fileReciever;
	}
	@Override
	public void execute() {
		fileReciever.createFile();
	}

}
