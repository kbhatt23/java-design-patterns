package stockBrokerExample;


public class StockBrokerClient {

	public static void main(String[] args) {
		String stockId = "yahoo1234";
		double price = 23.23;
		IStockReciever stockReciever = new YahooStock(stockId, price);
		
		StockCommand command = new BuyStockCommand(stockReciever);
		StockInvoker invoker = new StockInvoker(command);
		invoker.execute();
		
		 command = new SellStockCommand(stockReciever);
		 //could have used setter and not creating another object
		 invoker = new StockInvoker(command);
		invoker.execute();
		
	}

}
