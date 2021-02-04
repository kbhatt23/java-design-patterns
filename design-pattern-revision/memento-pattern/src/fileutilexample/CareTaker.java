package fileutilexample;

//this class also can be unique for different implemetations
//we could be using serialization
public class CareTaker implements ICareTaker{

	//the methods like undo and save state will be hidden
	private Object object;
	
	public void save(Undoable undoable) {
		Object savedState = undoable.saveState();
		this.object=savedState;
	}
	
	public void undo(Undoable undoable) {
		undoable.undoState(object);
	}
}
