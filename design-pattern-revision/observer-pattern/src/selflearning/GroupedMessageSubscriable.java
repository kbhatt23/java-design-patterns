package selflearning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupedMessageSubscriable<T> implements GroupedSelfSubscriable<T>{

	private String name;

	//bimap lets use java8
	private Map<SubscriberGroup,List<GroupSelfSubscriber<T>>> subscribers;

	public GroupedMessageSubscriable(String name) {
		this.name = name;
		this.subscribers = new HashMap<>();
	}

//	@Override
//	public void subscribe(SelfSubscriber<T> selfSubscriber) {
//		System.out.println("Subscription added for subscriber " + selfSubscriber.getName() + " to channel " + name);
//		subscribers.add(selfSubscriber);
//	}
//
//	@Override
//	public void publishMessage(T message) {
//		if (subscribers.isEmpty()) {
//			System.out.println("No subscribers present");
//			return;
//		}
//		subscribers.stream().forEach(subscriber -> subscriber.recieveMessage(message, this));
//	}
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void unsubscribe(GroupSelfSubscriber<T> selfSubscriber) {
		System.out.println("Subscription removed for subscriber " + selfSubscriber.getName() + " to channel " + name);
		Collection<List<GroupSelfSubscriber<T>>> allSubscribers = subscribers.values();
		
		for(List<GroupSelfSubscriber<T>> subscribersOFGroup : allSubscribers) {
			if(subscribersOFGroup.contains(selfSubscriber)) {
				subscribersOFGroup.remove(selfSubscriber);
				break;
			}
		}
	}

	@Override
	public void subscribe(GroupSelfSubscriber<T> selfSubscriber, SubscriberGroup subscriberGroup) {
		System.out.println("Subscription added for subscriber " + selfSubscriber.getName() + " to channel " + name);
		subscribers.computeIfAbsent(subscriberGroup,
				group -> new ArrayList<>()
				)
		//returns this nw arraylist if key was absent, if it was present it return the old list
		.add(selfSubscriber)
		;
	}

	@Override
	public void publishMessage(T message, SubscriberGroup subscriberGroup) {
		List<GroupSelfSubscriber<T>> subscribersOfGroup = subscribers.get(subscriberGroup);
		if(subscribersOfGroup != null)
			subscribersOfGroup.forEach(subscriber -> subscriber.recieveMessage(message, this));
		
	}


}
