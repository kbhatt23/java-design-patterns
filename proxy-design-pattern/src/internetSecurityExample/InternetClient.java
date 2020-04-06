package internetSecurityExample;

public class InternetClient {

	public static void main(String[] args) {
		
		Internet internet = new InternetProxy("www.google.com");
		//lazy init wont even load the connection 
		internet.connectToSite();
		
		
		Internet internet11 = new WebInternet("www.bad.com");
		internet11.connectToSite();
		
		Internet internet1 = new InternetProxy("www.bad.com");
		internet1.connectToSite();
	}

}
