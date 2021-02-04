package ordercancellationexample;

public class PaymentDoneORderState implements OrderState
{

	@Override
	public void handleCancellation() {
		System.out.println("Order cancellation starts in payment completed state");
		System.out.println("Asking Shipment provider to cancel the shipment");
		System.out.println("Asking the payment gateway for refund");
		System.out.println("Remove the order from session");
		System.out.println("Order cancelled sucesfully");
	}

}
