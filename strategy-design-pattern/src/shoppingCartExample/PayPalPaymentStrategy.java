package shoppingCartExample;

public class PayPalPaymentStrategy implements PaymentStrategy{
	private String userName;
	//encrypted
	private String password;
	
	public PayPalPaymentStrategy(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	@Override
	public void pay(double totalPrice) {
		System.out.println("Doing payment using paypal user "+userName);
		System.out.println("total payment to be done "+totalPrice);
	}

}
