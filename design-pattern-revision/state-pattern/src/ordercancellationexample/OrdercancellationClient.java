package ordercancellationexample;

public class OrdercancellationClient {
	public static void main(String[] args) {

		IOrder order = new Order();
		
		order.paymentSuccess();
		order.updateShipment();
		//default state is new
		order.handleCancel();
		System.out.println("==========");
		order.handleCancel();
		
	}
}
