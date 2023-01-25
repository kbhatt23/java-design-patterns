package polymorphism;

public class ExpressDelivery implements DeliveryStrategy{

	@Override
	public void deliverProduct(String productId, String address) {
		System.out.println("express delivery of product:"+productId+" to address:"+address);
	}

	@Override
	public void returnProduct(String productId, String address) {
		System.out.println("express return of product:"+productId+" from address:"+address);
	}

}
