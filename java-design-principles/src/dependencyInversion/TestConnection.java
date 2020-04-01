package dependencyInversion;

public class TestConnection {
public static void main(String[] args) {
	//could have used facgtory method to create MySQLConnection for abstraction
	//decoupong and data hiding
	ManageConnections connection  = new ManageConnections(
			//DBConnection.getConnection("mongo")
			DBConnection.getConnection("mysql")
			);
	try {
		connection.connect();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
