package interfaceSegregation.good;
//no need to inmpletment other cohesive interface as
//ragahav do not support suc methods or behaviours
public class RaghavRestraunt implements RestrauntGood , CashPaymentRestraunt{

	@Override
	public void prepareFood() {
		System.out.println("raghav bhakt preparing food");
	}

	//as in gods prashad we can not customize
	/*
	 * @Override public void customizeMeal() { throw new
	 * UnsupportedOperationException(); }
	 */

	//as godndo not take online payment
	//this method is forced by interface to implement
	/*
	 * @Override public void payOnline() { throw new
	 * UnsupportedOperationException(); }
	 */

	@Override
	public void payByCash() {
		System.out.println("payment karte samay boliye jai shree ram");
	}

}
