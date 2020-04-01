package interfaceSegregation.bad;

public class MadhavRestraunt implements RestrauntBad{

	@Override
	public void prepareFood() {
		System.out.println("madhav bhakt preparing food");		
	}

	@Override
	public void customizeMeal() {
		System.out.println("madhav bhakt customizing food");		
	}

	@Override
	public void payOnline() {
		System.out.println("raghav bhakt paying online");
	}

	@Override
	public void payByCash() {
		//as madhav is advanced and do nto take cash
throw new UnsupportedOperationException()		;
	}

}
