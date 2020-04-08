package nonGenericExample;

import java.util.List;

public class NotificationIterator implements Iterator{
	
	private int count=0;
	private List<Notification> notificationsList;
	
	public NotificationIterator(List<Notification> notificationsList) {
		this.notificationsList = notificationsList;
	}

	@Override
	public boolean hasNext() {
		int toatlSize = notificationsList.size();
		boolean success =false;
		if(count <= (toatlSize-1)) {
			success=true;
		}
		return success;
	}

	@Override
	public Object next() {
		Object item =  notificationsList.get(count);
		count++;
		return item;
	}

}
