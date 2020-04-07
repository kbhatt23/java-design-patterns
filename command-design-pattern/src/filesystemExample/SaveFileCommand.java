package filesystemExample;

public class SaveFileCommand implements Command {
	private FileReciever fileReciever;
	public SaveFileCommand(FileReciever fileReciever) {
		this.fileReciever = fileReciever;
	}
	@Override
	public void execute() {
		fileReciever.saveFile();
	}

}
