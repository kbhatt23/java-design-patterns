package selflearning;

import selflearning.GroupedSelfSubscriable.SubscriberGroup;

public class StringMessageChannelClient3 {
	public static void main(String[] args) {
		GroupedSelfSubscriable<String> channel = 
				new GroupedMessageSubscriable<>("king kong");
		
		GroupSelfSubscriber<String> user1 = 
				new GroupedMessageSubscriber<>("user1");
		GroupSelfSubscriber<String> user2 = 
				new GroupedMessageSubscriber<>("user2");
		GroupSelfSubscriber<String> user3 = 
				new GroupedMessageSubscriber<>("user3");
		GroupSelfSubscriber<String> user4 = 
				new GroupedMessageSubscriber<>("user4");
		
		channel.subscribe(user1, SubscriberGroup.LIVE);
		channel.subscribe(user2, SubscriberGroup.LIVE);
		
		channel.subscribe(user3, SubscriberGroup.MESSAGE);
		channel.subscribe(user4, SubscriberGroup.MESSAGE);
		
		channel.publishMessage("jai shree ram we are live", SubscriberGroup.LIVE);
		channel.publishMessage("jai shree ram we are sending message", SubscriberGroup.MESSAGE);
		
		//will be ignored
		channel.publishMessage("jai shree ram we are uploading", SubscriberGroup.UPLOAD);
	}
}
