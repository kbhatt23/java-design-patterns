package nonGenericExample;

import java.util.Date;

public class IteratorClient {

	public static void main(String[] args) {

		Collection<Notification> notificationCollection = new NotificationCollection();
		notificationCollection.addItem(new Notification("jai shree ram", new Date()));
		notificationCollection.addItem(new Notification("jai ramaduta hanuman", new Date()));
		notificationCollection.addItem(new Notification("jai radha krishna", new Date()));
		notificationCollection.addItem(new Notification("jai uma maheshwar", new Date()));
		notificationCollection.addItem(new Notification("jai saraswati brahma", new Date()));
		
		Iterator iterator = notificationCollection.getIterator();
		while(iterator.hasNext()) {
			//abstraction , client do not knwowhat is the type of indiviaul item
			Object notification1 = iterator.next();
			System.out.println("notification found "+notification1);
		}
	}

}
