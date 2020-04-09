package shoppingCartExample;
//commerce item
//bean
public class Item {
	private String skuId;
	private double unitPrice;
	private int quantity;
	public Item(String skuId, double unitPrice, int quantity) {
		this.skuId = skuId;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}
	public String getSkuId() {
		return skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
