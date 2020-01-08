package singleResponsibility;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class NotePadManipulator {

	//could have used bean named Note.java
	private List<String> notes = new ArrayList<String>();
	public List<String> getNotes() {
		return notes;
	}

	private static int count=0;
	public void addNote(String note) {
		notes.add("" + (++count) + " : "+note);
	}
	//we can add remove also
	
	@Override
	public String toString() {
		//comma seperated but in same line
		//return	String.join(",", notes);
		return	String.join(System.lineSeparator(), notes);
	}
	
	//bad features- that inhibits single reponsibility principle
	//bad approahc- inhibits reusability, and maintainability
	public void saveFile(String fileName) throws FileNotFoundException {
		try(PrintStream printStream = new PrintStream(fileName)){
			printStream.println(this);
		}
	}
}
