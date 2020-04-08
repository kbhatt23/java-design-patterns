package nonGenericExample;

import java.util.Date;

public class Notification {

	private String message;
	private Date date;
	public Notification(String message, Date date) {
		this.message = message;
		this.date = date;
	}
	@Override
	public String toString() {
		return "Notification [message=" + message + ", date=" + date + "]";
	}
}
