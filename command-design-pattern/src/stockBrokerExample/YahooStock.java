package stockBrokerExample;

public class YahooStock implements IStockReciever{

	private String stockId;
	private double price;
	
	public YahooStock(String stockId, double price) {
		this.stockId = stockId;
		this.price = price;
	}
	
	@Override
	public void buy() {
		System.out.println("buying yahoo stock "+stockId+ " with price "+price);
	}
	@Override
	public void sell() {
		System.out.println("selling yahoo stock "+stockId+ " with price "+price);
	}
}
