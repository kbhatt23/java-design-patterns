package filesystemExample;

public interface FileReciever {

	void createFile();
	void readFile();
	void editFile();
	void saveFile();
	//more actions can later on be added here
	//once more method is added for each method we need to create a concrete command class
}
