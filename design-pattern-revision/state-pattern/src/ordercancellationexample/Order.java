package ordercancellationexample;

public class Order implements IOrder {

	private OrderState orderState;

	public Order() {
		orderState = new NewStateCancellation();
	}

	@Override
	public void handleCancel() {
		orderState.handleCancellation();
		orderState = new CancelledOrderState();
	}

	@Override
	public void paymentSuccess() {
		orderState = new PaymentDoneORderState();
	}

	@Override
	public void updateShipment() {
		orderState = new ShippedOrderState();
	}

}
