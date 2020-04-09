package remoteControlExample.goodWay;

public class OffState implements RemoteControlState{

	@Override
	public void executeRequest() {
		System.out.println("Switching off the TV");
	}

}
