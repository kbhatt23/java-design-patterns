package shoppingCart;

public class ShoeItem implements CartItem{
	private String skuId;
	private double price;
	private int quantity;

	public ShoeItem(String skuId, double price, int quantity) {
		this.skuId = skuId;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public double calculatePrice(ShoppingCartVisitor shoppingCartVisitor) {
		return shoppingCartVisitor.visit(this);
	}

	public String getSkuId() {
		return skuId;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

}
