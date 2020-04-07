package errorHandlerExample;

public class CloudErrorHandler implements ErrorHandler {

	//no need as this is the last in chain
	//private ErrorHandler nextErrorHandler;

	@Override
	public void handleError(Logs logs) {
		String error = logs.getError();
		if(error == null || error.length() == 0) {
			System.out.println("CloudErrorHandler: No Error To handle");
			//breaking the chain
			return;
		}
		if(error.toLowerCase().contains("cloud")) {
			System.out.println("CloudErrorHandler: cloud is not working fine");
		}
		else {
			System.out.println("CloudErrorHandler: cloud is working fine");
		}
		
	}

	@Override
	public void setNextErrorHandler(ErrorHandler nextErrorHandler) {
		System.out.println("CloudErrorHandler: This is the last in the chain, hence not setting next errorHandler");
		throw new RuntimeException("next chain not supported");
	}




}
