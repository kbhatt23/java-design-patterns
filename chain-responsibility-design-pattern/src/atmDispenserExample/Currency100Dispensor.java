package atmDispenserExample;

public class Currency100Dispensor implements CurrencyDispensor {
	//again both isa and has a relationship of interface
	//similar to decorator and proxy 
	private CurrencyDispensor nextCurrencyDispensor;
	@Override
	public void dispense(Currency currency) {
		int amount = currency.getAmount();
		
		//notes that will be dispensed
		int currencyNotes = amount/100;
		System.out.println("dispensing "+currencyNotes +" 100 Rupee notes" );
		int remainingAmount = amount % 100;
		if(remainingAmount != 0) {
			//using the same object instead of creating new
			currency.setAmount(remainingAmount);
			nextCurrencyDispensor.dispense(currency);
		}
	}

	@Override
	public void setNextDispensor(CurrencyDispensor currencyDispensor) {
		this.nextCurrencyDispensor = currencyDispensor;
	}

}
