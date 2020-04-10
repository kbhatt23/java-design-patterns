package shoppingCart;

public class FruitItem implements CartItem{
	private String skuId;
	private double weight;
	private double pricePerKg;

	@Override
	public double calculatePrice(ShoppingCartVisitor shoppingCartVisitor) {
		return shoppingCartVisitor.visit(this);
	}

	public FruitItem(String skuId, double weight, double pricePerKg) {
		super();
		this.skuId = skuId;
		this.weight = weight;
		this.pricePerKg = pricePerKg;
	}

	public String getSkuId() {
		return skuId;
	}

	public double getWeight() {
		return weight;
	}

	public double getPricePerKg() {
		return pricePerKg;
	}

}
