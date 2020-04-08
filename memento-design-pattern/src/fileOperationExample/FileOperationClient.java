package fileOperationExample;

public class FileOperationClient {
public static void main(String[] args) {
	//do and undo is done using helper
	FileCareTaker fileCareTaker = new FileCareTaker();
	
	FileWriterUtil file = new FileWriterUtil("raghav.txt");
	file.writeContent("jai shree ram");
	
	fileCareTaker.save(file);
	System.out.println(file);
	file.writeContent(" jai radha krishna");
	
	file.writeContent(" jai hanuman");
	System.out.println(file);
	
	fileCareTaker.undo(file);
	System.out.println(file);
	
}
}
