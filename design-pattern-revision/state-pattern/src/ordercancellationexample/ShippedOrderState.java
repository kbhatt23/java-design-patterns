package ordercancellationexample;

public class ShippedOrderState implements OrderState{

	@Override
	public void handleCancellation() {
		System.out.println("Order cancellation starts in shipped state");
		System.out.println("Asking Shipment provider to get the item back");
		System.out.println("Asking the payment gateway for refund");
		System.out.println("Remove the order from session");
		System.out.println("Order cancelled sucesfully");
	}

}
