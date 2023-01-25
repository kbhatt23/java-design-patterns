package polymorphism;

public class InsuredDelivery implements DeliveryStrategy{

	@Override
	public void deliverProduct(String productId, String address) {
		System.out.println("insured delivery of product:"+productId+" to address:"+address);
	}

	@Override
	public void returnProduct(String productId, String address) {
		System.out.println("insured return of product:"+productId+" from address:"+address);
	}

}
