package selfexample;

import java.util.List;

public abstract class OrderExporter {

	//template method
	public final void exportOrder() {
		//if someone wants to find orders from third party override it
		List<Order> allOrders = fetchOrders();
		
		allOrders=filterOrders(allOrders);
		
		//exporting can be using file export, D.B export anything
		exportOrders(allOrders);
		
		//default implementation is email, we can choose sms if needed
		sendNotification(allOrders);
	}
	
	protected void sendNotification(List<Order> allOrders) {
		//might be needing attachment of orders list
		System.out.println("Sending email about sucessful order export");
	}


	protected abstract void exportOrders(List<Order> allOrders);

	//still user override this method
	//benefit of template
	//if he wants to get orders from web service instead of D.B
	protected List<Order> fetchOrders() {
		return OrderUtil.findAllOrders();
	}

	//protected means in other package object of subclass wont be able to call this method
	//only thing visible will be template method
	protected abstract List<Order> filterOrders(List<Order> allOrders);


}
