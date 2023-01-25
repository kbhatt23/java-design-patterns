package polymorphism;

public class StandardDelivery implements DeliveryStrategy{

	@Override
	public void deliverProduct(String productId, String address) {
		System.out.println("standard delivery of product:"+productId+" to address:"+address);
	}

	@Override
	public void returnProduct(String productId, String address) {
		System.out.println("standard return of product:"+productId+" from address:"+address);
	}

}
