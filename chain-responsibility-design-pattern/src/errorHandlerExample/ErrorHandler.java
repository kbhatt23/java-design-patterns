package errorHandlerExample;

public interface ErrorHandler {
	void handleError(Logs logs);
	
	void setNextErrorHandler(ErrorHandler nextErrorHandler);
}
