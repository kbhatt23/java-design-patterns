package errorHandlerExample;

public class EmailErrorHandler implements ErrorHandler{
	private ErrorHandler nextErrorHandler;

	@Override
	public void handleError(Logs logs) {
		String error = logs.getError();
		if(error == null || error.length() == 0) {
			System.out.println("EmailErrorHandler: No Error To handle");
			//breaking the chain
			return;
		}
		if(error.toLowerCase().contains("email")) {
			System.out.println("EmailErrorHandler:Email is not working fine");
		}else {
			System.out.println("EmailErrorHandler: Email is working fine");
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
