package ordercancellationexample;

public class CancelledOrderState implements OrderState{

	@Override
	public void handleCancellation() {
		System.out.println("Order is already cancelled");
	}

}
