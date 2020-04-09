package remoteControlExample.goodWay;

public class RemoteController {

	private RemoteControlState remoteControlState;

	
	public RemoteController(RemoteControlState remoteControlState) {
		this.remoteControlState = remoteControlState;
	}


	public void executeRequest() {
		//all if condition is moved to one line
		//competely decouple and flexible
		//open for new changes follows open closed prinicpple
		//no need of unit testing in future
		//this class will also be easily unit tested using mockable frameworks
		remoteControlState.executeRequest();
	}


	public RemoteControlState getRemoteControlState() {
		return remoteControlState;
	}


	public void setRemoteControlState(RemoteControlState remoteControlState) {
		this.remoteControlState = remoteControlState;
	}
}
