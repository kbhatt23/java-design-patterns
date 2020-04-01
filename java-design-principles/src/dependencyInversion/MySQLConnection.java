package dependencyInversion;

public class MySQLConnection implements DBConnection{

	@Override
	public void connect() {
		System.out.println("connecting to mysql DB");
	}

	@Override
	public void terminate() {
		System.out.println("terminating to mysql DB");
	}

}
