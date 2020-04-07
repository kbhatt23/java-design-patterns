package errorHandlerExample;

public class ErroHandlerClient {
	private ErrorHandler firstErrorHandler;

	public ErroHandlerClient() {
		this.firstErrorHandler = new EmailErrorHandler();
		ErrorHandler fax = new FaxErrorHandler();
		ErrorHandler cloud = new CloudErrorHandler();
		firstErrorHandler.setNextErrorHandler(fax);
		fax.setNextErrorHandler(cloud);
	}
	public void processLogs(Logs logs) {
		firstErrorHandler.handleError(logs);
	}

	public static void main(String[] args) {
		Logs logs = new Logs("jai shree ram info", "jai shree ram logs", "jai shree ram error email cloud");
		
		ErroHandlerClient client = new ErroHandlerClient();
		client.processLogs(logs);
	}
}
