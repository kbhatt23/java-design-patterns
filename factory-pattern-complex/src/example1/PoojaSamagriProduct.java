package example1;

public class PoojaSamagriProduct implements Product{

	@Override
	public void generateProduct() {
		System.out.println("creating PoojaSamagriProduct");
	}

	@Override
	public void sellProduct() {
		System.out.println("selling PoojaSamagriProduct");
	}

}
