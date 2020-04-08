package dbImportExample;

public class FileDataLoader extends DataBaseLoader{

	@Override
	protected StringBuilder fetchData() {
		System.out.println("Calling web service to fetch data");
		return new StringBuilder().append("jai radha krishna");
	}

	@Override
	protected void saveDataInDB(StringBuilder sb) {
		System.out.println("saving data in DB "+sb);
	}

}
