package stockBrokerExample;

public class BuyStockCommand implements StockCommand{
	private IStockReciever stockReciever;
	public BuyStockCommand(IStockReciever stockReciever) {
		this.stockReciever = stockReciever;
	}
	@Override
	public void execute() {
		//dumb command
		//coudl have saved the state of reciever before modifying
		//this can be helpful in undoing
		stockReciever.buy();
	}

}
