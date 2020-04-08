package fileOperationExample;

public class FileCareTaker {
	//not whowing the real object
	private Object data;

	
	public void save(UndoableFile data) {
		this.data = data.saveState();
	}
	
	public void undo(UndoableFile file) {
		//passing saved data
		file.undoState(data);
	}
	
	
}
