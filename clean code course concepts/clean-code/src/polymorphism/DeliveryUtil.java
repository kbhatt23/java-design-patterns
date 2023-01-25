package polymorphism;

public class DeliveryUtil {

	public static void deliverProduct(DeliveryStrategy deliveryStrategy, String productID , String address) {
		deliveryStrategy.deliverProduct(productID, address);
	}
	
	public static void returnProduct(DeliveryStrategy deliveryStrategy, String productID , String address) {
		deliveryStrategy.returnProduct(productID, address);
	}
}
