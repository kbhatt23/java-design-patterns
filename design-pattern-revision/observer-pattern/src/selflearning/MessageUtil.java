package selflearning;

import java.util.ArrayList;
import java.util.List;

import selflearning.GroupedSelfSubscriable.SubscriberGroup;

public class MessageUtil {

	public static <T> void startMessaging(T message, int numOfUsers, int unsubscribeIndex) {

		//as of now messgae is tring
		//later can be any object
		SelfSubscriable<T> channel = new MessageSubscriable<>("talkfcb");

		SelfSubscriber<T> user = null;
		List<SelfSubscriber<T>> users = new ArrayList<>();
		for(int i= 1; i <= numOfUsers ; i++) {
			user = new MessageSubscriber<>("user-"+i);
			users.add(user);
			channel.subscribe(user);
			if(unsubscribeIndex == i)
				channel.unsubscribe(user);
		}
		
		
		channel.setName("new talkfcb");
		System.out.println("raghav: before any update "+users);
		channel.publishMessage(message);
		System.out.println("raghav: after first update "+users);
		
		channel.setName("new talkfcb updated");
		channel.publishMessage(message);
		System.out.println("raghav: after second update "+users);
	
	}
	
	public static <T> void startGroupMessaging(T message, int numOfUsers, int unsubscribeIndex) {

		//as of now messgae is tring
		//later can be any object
		GroupedSelfSubscriable<T> channel = new GroupedMessageSubscriable<>("talkfcb");

		GroupSelfSubscriber<T> user = null;
		for(int i= 1; i <= numOfUsers ; i++) {
			user = new GroupedMessageSubscriber<>("user-"+i);
			channel.subscribe(user,SubscriberGroup.LIVE);
			if(unsubscribeIndex == i)
				channel.unsubscribe(user);
		}
		
		
		channel.publishMessage(message,SubscriberGroup.LIVE);
		
		System.out.println("sending again");
		//also try some toher subscriber group
		channel.publishMessage(message,SubscriberGroup.MESSAGE);
	}
}
