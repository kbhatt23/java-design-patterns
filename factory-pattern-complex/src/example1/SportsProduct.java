package example1;

public class SportsProduct implements Product{

	@Override
	public void generateProduct() {
		System.out.println("creating SportsProduct");
	}

	@Override
	public void sellProduct() {
		System.out.println("selling SportsProduct");		
	}

}
