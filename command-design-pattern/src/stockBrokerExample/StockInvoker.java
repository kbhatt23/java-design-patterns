package stockBrokerExample;


public class StockInvoker {

	private StockCommand command;

	public StockInvoker(StockCommand command) {
		super();
		this.command = command;
	}
	
	public void execute() {
		command.execute();
	}
	
	//cpould have undo redo methtods
}
