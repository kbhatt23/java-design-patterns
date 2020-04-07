package atmDispenserExample;

public interface CurrencyDispensor {

	//actual dispense method
	void dispense(Currency currency);
	
	void setNextDispensor(CurrencyDispensor currencyDispensor);
}
