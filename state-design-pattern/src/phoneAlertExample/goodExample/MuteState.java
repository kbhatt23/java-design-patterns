package phoneAlertExample.goodExample;

public class MuteState implements MobileState{

	@Override
	public void showAlert() {
		System.out.println("Displaying alert in mute mode");
	}

}
