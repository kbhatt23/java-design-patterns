package ordercancellationexample;

public class NewStateCancellation implements OrderState{

	//if state is new its easy just cancel it
	@Override
	public void handleCancellation() {
		System.out.println("Order cancellation starts in New state");
		System.out.println("Removing the order from Data base");
		System.out.println("Remove the order from session");
		System.out.println("Order cancelled sucesfully");
	}

}
