package dbImportExample;

public class WebServiceLoader extends DataBaseLoader{

	@Override
	protected StringBuilder fetchData() {
		System.out.println("Calling web service to fetch data");
		
		//db willl not insert empty data
		//will be skipped
		//return null;
		return new StringBuilder().append("jai shree ram");
	}

	@Override
	protected void saveDataInDB(StringBuilder sb) {
		System.out.println("saving data in DB "+sb);
	}

}
