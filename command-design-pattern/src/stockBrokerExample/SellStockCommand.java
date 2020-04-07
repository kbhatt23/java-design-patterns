package stockBrokerExample;

public class SellStockCommand implements StockCommand{
	private IStockReciever stockReciever;
	public SellStockCommand(IStockReciever stockReciever) {
		this.stockReciever = stockReciever;
	}
	@Override
	public void execute() {
		//dumb command
		//coudl have saved the state of reciever before modifying
		//this can be helpful in undoing
		stockReciever.sell();
	}

}
