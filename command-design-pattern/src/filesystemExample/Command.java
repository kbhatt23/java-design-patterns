package filesystemExample;


//defines the actions sets here
//mostly command have only execute
//but smart commmands can have undo redo callback features as well
public interface Command {
	void execute();

	//void undo();
	//void redo();
}
