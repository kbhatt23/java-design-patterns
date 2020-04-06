package internetSecurityExample;

public class WebInternet implements Internet {
	private String url;
	//default access
	WebInternet(String url) {
		this.url = url;
		//eager loading
		loadConnection(url);
	}

	@Override
	public void connectToSite() {
		System.out.println("Connected to Site with URL "+url);
	}
	
	private void loadConnection(String url) {
		System.out.println("Loading connecto to URL "+url);
	}

}
