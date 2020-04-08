package dbImportExample.client;

import dbImportExample.DataBaseLoader;
import dbImportExample.FileDataLoader;
import dbImportExample.WebServiceLoader;

public class DBLoaderClient {

	public static void main(String[] args) {

		DataBaseLoader loader1 = new WebServiceLoader();
		loader1.loadData();
		System.out.println("====================");
		
		DataBaseLoader loader2 = new FileDataLoader();
		loader2.loadData();
	}

}
