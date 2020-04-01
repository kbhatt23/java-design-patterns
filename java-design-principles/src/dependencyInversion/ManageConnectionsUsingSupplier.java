package dependencyInversion;

import java.util.function.Supplier;

public class ManageConnectionsUsingSupplier {

	DBConnection dbConnection;
	//we can use supplier here instead of direct object
	//or could pass an interface and manually call get method of that interface
	//however we can not use in our case as we have 2 methods in DBConnection interface
	public ManageConnectionsUsingSupplier(Supplier<DBConnection> connectionSupplier) {
		this.dbConnection = connectionSupplier.get();
	}
	public void connect() throws InterruptedException {
	this.dbConnection.connect();
	Thread.sleep(200);
	this.dbConnection.terminate();
	}
}
