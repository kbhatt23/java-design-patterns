package fluentinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
//mimicking the general flow of checkout
public class OrderNonflexible {

	private List<String> items;
	
	private String address;
	
	private int orderID;
	private static final Random RANDOM = new Random(); 
	
	public OrderNonflexible() {
		//generate random order id
		//can not add it during placeorder lazily as we will need it during tracking of missed order
		orderID = RANDOM.nextInt(10000)+100;
	}
	
	//lets be lazy
	public void addItem(String item) {
		//validations
		if(item == null || item.length() == 0) {
			throw new IllegalArgumentException("item can not be empty");
		}
		if(items == null)
			items = new ArrayList<>();
		items.add(item);
	}
	
	public void addAddress(String address) {
		//validations
		if(address == null || address.length() == 0) {
			throw new IllegalArgumentException("address can not be empty");
		}
		this.address=address;
	}
	
	//final checkout step
	public void checkout() {
		//validations
		if(items == null || items.size() == 0) {
			throw new IllegalArgumentException("items can not be empty");
		}
		if(address == null || address.length() == 0) {
			throw new IllegalArgumentException("address can not be empty");
		}
		
		System.out.println(String.format("checking out order with ID %d , with address %s and items %s",
					orderID, address,items
				));
	}
	
	
}
