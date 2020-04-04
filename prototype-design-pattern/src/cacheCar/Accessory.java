package cacheCar;

public class Accessory implements Cloneable{
	private int barcode;
	private double price;
	public Accessory(int barcode, double price) {
		super();
		this.barcode = barcode;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Accessory [barcode=" + barcode + ", price=" + price + "]";
	}
	public int getBarcode() {
		return barcode;
	}
	public void setBarcode(int barcode) {
		this.barcode = barcode;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public Accessory clone() throws CloneNotSupportedException {
		return (Accessory)super.clone();
	}
}
