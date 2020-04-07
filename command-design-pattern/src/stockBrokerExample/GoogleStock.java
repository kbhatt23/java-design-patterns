package stockBrokerExample;

public class GoogleStock implements IStockReciever{

	private String stockId;
	private double price;
	
	public GoogleStock(String stockId, double price) {
		this.stockId = stockId;
		this.price = price;
	}
	
	@Override
	public void buy() {
		System.out.println("buying google stock "+stockId+ " with price "+price);
	}
	@Override
	public void sell() {
		System.out.println("selling google stock "+stockId+ " with price "+price);		
	}
}
