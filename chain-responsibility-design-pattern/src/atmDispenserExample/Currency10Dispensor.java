package atmDispenserExample;

public class Currency10Dispensor implements CurrencyDispensor {
	//again both isa and has a relationship of interface
	//similar to decorator and proxy 
	private CurrencyDispensor nextCurrencyDispensor;
	@Override
	public void dispense(Currency currency) {
		int amount = currency.getAmount();
		
		//notes that will be dispensed
		int currencyNotes = amount/10;
		System.out.println("dispensing "+currencyNotes +" 10 Rupee notes" );
		int remainingAmount = amount % 10;
		if(remainingAmount != 0) {
			System.out.println("Can not process the requested amount");
		}
	}

	@Override
	public void setNextDispensor(CurrencyDispensor currencyDispensor) {
		this.nextCurrencyDispensor = currencyDispensor;
	}

}
