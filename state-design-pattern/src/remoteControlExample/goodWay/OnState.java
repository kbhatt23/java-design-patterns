package remoteControlExample.goodWay;

public class OnState implements RemoteControlState{

	@Override
	public void executeRequest() {
		System.out.println("Switching on the TV");
	}

}
