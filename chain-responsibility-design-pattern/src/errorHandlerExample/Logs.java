package errorHandlerExample;

public class Logs {

	private String info;
	private String message;
	private String error;
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getMessage() {
		return message;
	}
	public Logs(String info, String message, String error) {
		super();
		this.info = info;
		this.message = message;
		this.error = error;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
}
