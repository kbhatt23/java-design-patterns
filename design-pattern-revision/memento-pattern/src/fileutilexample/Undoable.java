package fileutilexample;

//we must be able to expose saving the state and undoing to last saved state
public interface Undoable {
	
	//save current state and return so that caretaker can save it
	//returns memento object
	//showing object to hide inner methods
	Object saveState();
	
	//undo state from some instance from caretaker
	void undoState(Object savedInstance);

}
