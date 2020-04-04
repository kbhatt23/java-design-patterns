package cacheCar;

//not using interface so taht we can reuse the clone method here itself
//instead of overriding clone methods ina l subclasses of interfaces
//also concrete implemetnation of reusable methods can be done here
public abstract class Vehicle implements Cloneable{
	
	private String id;
	private String type;
	private double price;
	private Accessory accessory;
	
	public abstract void printPrice();
		
	
	public Vehicle(String id, String type, double price, Accessory accessory) {
		this.id = id;
		this.type = type;
		this.price = price;
		this.accessory = accessory;
	}

	@Override
	public Vehicle clone() throws CloneNotSupportedException {
		
		Vehicle vehicle = (Vehicle) super.clone();
		vehicle.accessory = this.accessory.clone();
				
		return vehicle;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Accessory getAccessory() {
		return accessory;
	}

	public void setAccessory(Accessory accessory) {
		this.accessory = accessory;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", type=" + type + ", price=" + price + ", accessory=" + accessory + "]";
	}
}
