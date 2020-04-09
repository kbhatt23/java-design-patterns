package remoteControlExample.goodWay;

public class RemoteControllerClientV1 {
public static void main(String[] args) {
	OnState onstate = new OnState();
	RemoteController controller = new RemoteController(onstate);
	controller.executeRequest();
	System.out.println("\n");
	 
	//state change
	OffState offstate = new OffState();
	controller.setRemoteControlState(offstate);
	controller.executeRequest();
}
}
