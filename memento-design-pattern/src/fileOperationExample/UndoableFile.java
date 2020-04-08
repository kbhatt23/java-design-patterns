package fileOperationExample;

public interface UndoableFile {
	
	Object saveState();
	
	void undoState(Object file);

}
