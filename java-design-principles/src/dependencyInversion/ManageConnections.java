package dependencyInversion;

public class ManageConnections {

	DBConnection dbConnection;
	
	public ManageConnections(DBConnection dbConnection) {
		this.dbConnection = dbConnection;
	}
	public void connect() throws InterruptedException {
	this.dbConnection.connect();
	Thread.sleep(200);
	this.dbConnection.terminate();
	}
}
