package singleResponsibility;

import java.io.FileNotFoundException;

public class NotePadClient {

	public static void main(String[] args) throws FileNotFoundException {
		NotePadManipulator mani = new NotePadManipulator();
		
		mani.addNote("jai shree ram");
		mani.addNote("jai ramduta hanuman");
		
		System.out.println(mani);
		
		String fileName = "C:\\Kanishk\\files-generation\\kaka.txt";
		FileWriter writer = new FileWriter();
		writer.saveFile(fileName, mani.toString());
	}

}
