package filesystemExample;

public class UnixSystemFileReciever implements FileReciever {

	@Override
	public void createFile() {

		System.out.println("Creating file in Unix system");
	}

	@Override
	public void readFile() {
		System.out.println("Reading file in Unix system");

	}

	@Override
	public void editFile() {
		System.out.println("Editing file in Unix system");
	}

	@Override
	public void saveFile() {
		System.out.println("SAving file in Unix system");
	}

}
