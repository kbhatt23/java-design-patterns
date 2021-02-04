package fileutilexample;

public class FileUtilMementoClient {
	public static void main(String[] args) {

		//ICareTaker careTaker = new CareTaker();
		
		ICareTaker careTaker = new CareTakerSerialization();
		
		FileUtil fileUtil = new FileUtil("shree-ram.txt");
		fileUtil.writeLine("jai shree ram");
		
		fileUtil.writeLine("jai radhe shyam");
		
		careTaker.save(fileUtil);

		fileUtil.writeLine("another non sense line");
		System.out.println("filecontent before undoing "+fileUtil);
		
		careTaker.undo(fileUtil);
		System.out.println("filecontent after undoing "+fileUtil);
	}
}
