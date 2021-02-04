package fileutilexample;

public interface ICareTaker {

	public void save(Undoable undoable);

	public void undo(Undoable undoable);
}
