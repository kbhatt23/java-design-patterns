package atmDispenserExample;

public class Currency {
	//from atm machine we can get integer type amount only
	private int amount;

	public Currency(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}
