package ordercancellationexample;

public interface IOrder {

	//tasks that can be done on order
	void handleCancel();

	//called by payment gateway once payment is sucessful
	void paymentSuccess();
	
	//called by shipment party once shipment is done succesfully
	void updateShipment();
	
}
