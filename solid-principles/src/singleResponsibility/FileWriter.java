package singleResponsibility;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FileWriter {
	//adds reusability
	//will force code changes only in this
	//in case of bug need to change here only for functionlity
	//easier to understand
	public void saveFile(String fileName , Object data) throws FileNotFoundException {
		try(PrintStream printStream = new PrintStream(fileName)){
			printStream.println(data);
		}
	}
}
