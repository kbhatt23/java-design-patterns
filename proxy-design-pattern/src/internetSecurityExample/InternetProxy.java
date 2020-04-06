package internetSecurityExample;

import java.util.Arrays;
import java.util.List;

public class InternetProxy implements Internet{

	private String url;
	private Internet internet;
	private static final List<String> validURLs = 
			Arrays.asList("www.udemy.com" , "www.google.com" , "www.learning.com");
	//default access
	InternetProxy(String url) {
		
		//authentication and security part
		if(!validURLs.contains(url)) {
			throw new RuntimeException("Trying to access banned site");
		}
		
		this.url = url;
		//lazy loading
		//loadConnection(url);
	}

	@Override
	public void connectToSite() {
		//lazy init
		if(internet == null) {
			internet = new WebInternet(url);
		}
		
		//delegation to actual target method
		internet.connectToSite();
	}
	



}
