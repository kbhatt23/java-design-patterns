package filesystemExample;

public class ReadFileCommand implements Command {
	private FileReciever fileReciever;
	public ReadFileCommand(FileReciever fileReciever) {
		this.fileReciever = fileReciever;
	}
	@Override
	public void execute() {
		fileReciever.readFile();
	}

}
