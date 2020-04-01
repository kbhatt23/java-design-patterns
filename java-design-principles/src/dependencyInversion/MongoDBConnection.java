package dependencyInversion;

public class MongoDBConnection implements DBConnection{

	@Override
	public void connect() {
		System.out.println("connecting to mongo DB");		
	}

	@Override
	public void terminate() {
		System.out.println("terminating to mongo DB");		
	}

}
