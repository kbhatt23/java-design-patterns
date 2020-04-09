package phoneAlertExample.goodExample;

public class GoodAlertClient {

	public static void main(String[] args) {
		//volume,mute,vibration
		MobileState muteState = new MuteState();
		
		MobilePhone phone = new MobilePhone(muteState);
		phone.showAlert();
		
		//chaning the state
		phone.setMobileState(new VolumeState());
		phone.showAlert();
	
	}

}
