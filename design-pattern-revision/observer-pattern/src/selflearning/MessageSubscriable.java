package selflearning;

import java.util.ArrayList;
import java.util.List;

public class MessageSubscriable<T> implements SelfSubscriable<T>{

	private String name;

	private List<SelfSubscriber<T>> subscribers;

	public MessageSubscriable(String name) {
		this.name = name;
		this.subscribers = new ArrayList<>();
	}

	@Override
	public void subscribe(SelfSubscriber<T> selfSubscriber) {
		System.out.println("Subscription added for subscriber " + selfSubscriber.getName() + " to channel " + name);
		subscribers.add(selfSubscriber);
	}

	@Override
	public void publishMessage(T message) {
		if (subscribers.isEmpty()) {
			System.out.println("No subscribers present");
			return;
		}
		subscribers.stream().forEach(subscriber -> subscriber.recieveMessage(message, this));
	}
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void unsubscribe(SelfSubscriber<T> selfSubscriber) {
		System.out.println("Subscription removed for subscriber " + selfSubscriber.getName() + " to channel " + name);
		subscribers.remove(selfSubscriber);
	}

}
