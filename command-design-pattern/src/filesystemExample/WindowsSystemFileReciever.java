package filesystemExample;

public class WindowsSystemFileReciever implements FileReciever {

	@Override
	public void createFile() {

		System.out.println("Creating file in Windows system");
	}

	@Override
	public void readFile() {
		System.out.println("Reading file in Windows system");

	}

	@Override
	public void editFile() {
		System.out.println("Editing file in Windows system");
	}

	@Override
	public void saveFile() {
		System.out.println("SAving file in Windows system");
	}

}
