package shoppingCartExample;

public class CreditCardPaymentStrategy implements PaymentStrategy{
	private String cardNumber;
	private String cvv;
	private String expiryDate;
	

	public CreditCardPaymentStrategy(String cardNumber, String cvv, String expiryDate) {
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.expiryDate = expiryDate;
	}


	@Override
	public void pay(double totalPrice) {
		System.out.println("Doing payment using credit card "+cardNumber);
		System.out.println("total payment to be done "+totalPrice);
	}

}
