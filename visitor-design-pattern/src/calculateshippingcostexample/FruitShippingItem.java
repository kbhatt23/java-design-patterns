package calculateshippingcostexample;

public class FruitShippingItem implements ShippingItem{
	private String skuId;
	private double weight;
	private double deliveryCostPerKG;
	public FruitShippingItem(String skuId, double weight, double deliveryCostPerKG) {
		this.skuId = skuId;
		this.weight = weight;
		this.deliveryCostPerKG = deliveryCostPerKG;
	}
	@Override
	public double calculateShipping(ShippingCalculatorVistor visitor) {
		return visitor.calculateShippingPrice(this);
	}
	public String getSkuId() {
		return skuId;
	}
	public double getWeight() {
		return weight;
	}
	public double getDeliveryCostPerKG() {
		return deliveryCostPerKG;
	}

}
