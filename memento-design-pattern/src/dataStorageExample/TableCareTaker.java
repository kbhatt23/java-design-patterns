package dataStorageExample;

public class TableCareTaker {
	private Object savedObject;
	
	public void saveDB(DataBaseTable table) {
		this.savedObject =table.saveDB();
	}
	
	public void undo(DataBaseTable table) {
		table.undoDB(this.savedObject);
	}
}
