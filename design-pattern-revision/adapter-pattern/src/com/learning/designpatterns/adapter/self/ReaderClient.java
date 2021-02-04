package com.learning.designpatterns.adapter.self;

public class ReaderClient {
	public static void main(String[] args) {

		//what if a new api comes whhihc do not fillow our contract
		Reader reader = new StreamFileReader();
		String path="/files/utils/read/kapela.txt";
		manipulatReading(reader,path);
		
		System.out.println("=========================");
		//using legacy code
		//no modification done in existin api code
		LegacyReader legacyReader = new LegacyReader();
		Reader readerAdapter = new LegacyReaderAdapter(legacyReader);
		manipulatReading(readerAdapter,path);
	}

	//no need to modify existing code
	private static void manipulatReading(Reader reader, String path) {
		FileReaderUtil util = new FileReaderUtil(reader);
		System.out.println("client recieved file "+util.startReading(path));
	}
}
