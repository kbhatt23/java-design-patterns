package dependencyInversion;

//low level class interface contract
public interface DBConnection {

	public void connect();
	public void terminate();
	
	//force contract creation instead of seperate factory class
	static DBConnection getConnection(String type) {
		DBConnection connection = null;
		switch (type) {
		case "mysql":
			connection= new MySQLConnection();
			break;
		case "mongo":
			connection = new MongoDBConnection();
			break;
		default:
			connection = new MySQLConnection();
			break;
		}
		return connection;
	}
}
