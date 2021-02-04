package fileutilexample;

import java.io.Serializable;

//main class whose state has to be undoable
//if we save the util class directly it breaks encapsulation
//the state vlaues stored in the memeory for undoing will become visible
//memento will not have setter getter and will be either stored as direct object or serailzaiton or cache/d.b
public class FileUtil implements Undoable {

	private static final long serialVersionUID = 1465098777460396575L;

	// states
	private String fileName;

	// content of file
	private StringBuilder stringBuilder;

	public FileUtil(String fileName) {
		this.fileName = fileName;
		stringBuilder = new StringBuilder();
	}

	// writing contnet to file
	public void writeLine(String line) {
		stringBuilder.append(line).append(System.lineSeparator());
	}

	@Override
	public Object saveState() {
		return new Memento(fileName, stringBuilder);
	}

	@Override
	public void undoState(Object savedInstance) {
		Memento memento = (Memento) savedInstance;
		this.fileName = memento.fileName;
		this.stringBuilder = new StringBuilder(memento.stringBuilder);

	}

	// we must hide internal implementation, thats why private inner class
	// can exist independently
	// no one will ever know event hsi class exist
	private static class Memento implements Serializable{
		// copy the sates like builder pattern
		private String fileName;

		// content of file
		private StringBuilder stringBuilder;

		// whatever is existing on filewriter we save that
		// no option of writing file
		public Memento(String fileName, StringBuilder stringBuilder) {
			this.fileName = fileName;
//			this.stringBuilder = stringBuilder;
			// strinbuilder is mutable and hence we must make copy, otherwise any new change
			// in main class's stringbuilder will reflect here
			// hence undo wont work
			this.stringBuilder = new StringBuilder(stringBuilder);
		}

	}

	@Override
	public String toString() {
		return "FileUtil [fileName=" + fileName + ", stringBuilder=" + stringBuilder + "]";
	}
}
