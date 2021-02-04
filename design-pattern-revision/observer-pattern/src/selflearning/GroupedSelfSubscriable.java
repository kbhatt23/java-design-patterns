package selflearning;

public interface GroupedSelfSubscriable<T> {

	void subscribe(GroupSelfSubscriber<T> selfSubscriber, SubscriberGroup subscriberGroup);
	
	void publishMessage(T message,SubscriberGroup subscriberGroup);
	
	String getName();
	
	void unsubscribe(GroupSelfSubscriber<T> selfSubscriber);


	public static enum SubscriberGroup{
		MESSAGE,UPLOAD,LIVE
	}
}
