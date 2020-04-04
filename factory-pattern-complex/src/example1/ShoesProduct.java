package example1;

public class ShoesProduct implements Product{

	@Override
	public void generateProduct() {
		System.out.println("creating ShoesProduct");
	}

	@Override
	public void sellProduct() {
		System.out.println("selling ShoesProduct");		
	}

}
