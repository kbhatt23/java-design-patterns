package errorHandlerExample;

public class FaxErrorHandler implements ErrorHandler{

	private ErrorHandler nextErrorHandler;

	@Override
	public void handleError(Logs logs) {
		String error = logs.getError();
		if(error == null || error.length() == 0) {
			System.out.println("FaxErrorHandler: No Error To handle");
			//breaking the chain
			return;
		}
		if(error.toLowerCase().contains("fax")) {
			System.out.println("FaxErrorHandler: Fax is not working fine");
		}else {
			System.out.println("FaxErrorHandler: Fax is working fine");
		}
		
		//error is present but we can nothandle in this handler
		//passing the same logs object
		nextErrorHandler.handleError(logs);
	}

	@Override
	public void setNextErrorHandler(ErrorHandler nextErrorHandler) {
		this.nextErrorHandler = nextErrorHandler;

	}



}
