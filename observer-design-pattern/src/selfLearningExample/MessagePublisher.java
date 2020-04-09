package selfLearningExample;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Publisher{
	//new instance can not be added
	private final List<Subscriber> subscribers ;
	private String name;

	public MessagePublisher(String name) {
		this.subscribers = new ArrayList<Subscriber>();
		this.name = name;
	}

	@Override
	public void subscribe(Subscriber subscriber) {
		System.out.println("subscribing subscriber "+subscriber);
		subscribers.add(subscriber);
	}

	@Override
	public void unsubscribe(Subscriber subscriber) {
		System.out.println("unsubscribing subscriber "+subscriber);
		subscribers.remove(subscriber);
	}

	private void notifySubscribers() {
		for(Subscriber subsc : subscribers) {
			subsc.recieveMessage("Name is changed for publisher "+name);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		notifySubscribers();
	}

	@Override
	public void changeState(String state) {
		setName(state);
	}

}
