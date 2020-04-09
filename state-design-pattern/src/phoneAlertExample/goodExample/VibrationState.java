package phoneAlertExample.goodExample;

public class VibrationState implements MobileState{
	@Override
	public void showAlert() {
		System.out.println("Making vibration sound to alert");
	}
}