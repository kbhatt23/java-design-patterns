package fileOperationExample;
//main class is exposed however meneto class is hidden
//acheived using private inner class
public class FileWriterUtil implements UndoableFile{
	//mimicking file operations and state
	private String fileName;
	//mimicking file data with stringbuilder
	private StringBuilder content;
	
	public FileWriterUtil(String fileName) {
		this.fileName = fileName;
		content = new StringBuilder();
	}
	@Override
	public String toString() {
		return "FileWriterUtil [fileName=" + fileName + ", content=" + content + "]";
	}
	
	public void writeContent(String data) {
		content.append(data);
	}
	
	@Override
	public Object saveState() {

		return new Memento(fileName, content);
	}
	@Override
	public void undoState(Object obj) {
		Memento memento =(Memento) obj;
		this.content = memento.content;
		this.fileName = memento.fileName;
		
	}
	
	//client should not be seeing the logic on how it is saved and what is the internal structure of saved state
		//non static inner class so that outside client can not create this class withotcreating mainclass
		//also non static inner class can have non static methods and variables, static inner class can only have static methods and variable
		private class Memento{
			private String fileName;
			
			private StringBuilder content;

			public Memento(String fileName, StringBuilder content) {
				//string is immutable so same value can be stored
				this.fileName = fileName;
				//creating new object
				//otherwise if client modifies after undo it will still point to one, basically undo wont work for objects
				this.content = new StringBuilder(content);
			}
			
		}

}
