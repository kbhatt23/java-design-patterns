package nonGenericExample;
//this class can hold collection of notification only
//we could have made a generic using generics also

import java.util.ArrayList;
import java.util.List;

public class NotificationCollection implements Collection<Notification>{
	
	//could have been using array or set
	//benefit is client do not know what internally API have devloped
	List<Notification> notificationList = new ArrayList<Notification>();
	
	@Override
	public void addItem(Notification element) {
		notificationList.add(element);
	}

	@Override
	public Iterator getIterator() {
		return new NotificationIterator(notificationList);
	}

}
