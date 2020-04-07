package filesystemExample;

public class EditFileCommand implements Command {
	private FileReciever fileReciever;
	public EditFileCommand(FileReciever fileReciever) {
		this.fileReciever = fileReciever;
	}
	@Override
	public void execute() {
		fileReciever.editFile();
	}

}
