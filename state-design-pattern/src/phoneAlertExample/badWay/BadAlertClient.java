package phoneAlertExample.badWay;

public class BadAlertClient {

	public static void main(String[] args) {
		//volume,mute,vibration
		String initState= "mute";
		MobilePhone phone = new MobilePhone(initState);
		phone.showAlert();
	}

}
