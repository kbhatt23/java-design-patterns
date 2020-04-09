package phoneAlertExample.goodExample;

//monolith
public class MobilePhone {
	
	private MobileState mobileState;
	//init state
	public MobilePhone(MobileState mobileState) {
		this.mobileState = mobileState;
	}

	public MobileState getMobileState() {
		return mobileState;
	}
	//in future can mobidy the state
	public void setMobileState(MobileState mobileState) {
		this.mobileState = mobileState;
	}
	
	public void showAlert() {
		//instead of if else cases we cna juist delegate to single state
		mobileState.showAlert();
	}
}
