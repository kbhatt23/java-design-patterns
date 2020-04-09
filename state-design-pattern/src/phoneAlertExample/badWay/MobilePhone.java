package phoneAlertExample.badWay;

public class MobilePhone {

	private String currentState;

	public MobilePhone(String currentState) {
		this.currentState = currentState;
	}

	public String getCurrentState() {
		return currentState;
	}

	public void setCurrentState(String currentState) {
		this.currentState = currentState;
	}
	
	//logic method
	public void showAlert() {
		if(currentState.equals("volume")) {
			//could be huge business logic here
			//thats why this if conditions can make it a monolith
			//also if more state comes thatn it will keep on becoming less flexible
			System.out.println("playing alert notificaion music");
		}else if(currentState.equals("mute")){
			System.out.println("Displaying alert in mute mode");
		}
		else if(currentState.equals("vibration")) {
			System.out.println("Making vibration sound to alert");
		}
	}
	
}
