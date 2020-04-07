package filesystemExample;

public class FileSystemClient {

	public static void main(String[] args) {
		FileReciever reciever = new UnixSystemFileReciever();
		
		Command command =  new CreateFileCommand(reciever);
		
		FileSystemInvoker invoker = new FileSystemInvoker(command);
		
		invoker.execute();
		
		//read file
		//coudl be windows reviever as well
		//reciever = new UnixSystemFileReciever();
		command  = new ReadFileCommand(reciever);
		invoker = new FileSystemInvoker(command);
		
		invoker.execute();

		//edit file
		//coudl be windows reviever as well
		//reciever = new UnixSystemFileReciever();
		command  = new EditFileCommand(reciever);
		invoker = new FileSystemInvoker(command);
		
		invoker.execute();
		
		//read file
		//coudl be windows reviever as well
		//reciever = new UnixSystemFileReciever();
		command  = new SaveFileCommand(reciever);
		invoker = new FileSystemInvoker(command);
		
		invoker.execute();		
		
		
	}

}
