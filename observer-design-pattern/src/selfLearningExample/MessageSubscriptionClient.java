package selfLearningExample;

public class MessageSubscriptionClient {
public static void main(String[] args) {
	Publisher publisher = new MessagePublisher("ramayan");
	
	Subscriber subscriber1 = new MessageSubscriber("hanuman");
	Subscriber subscriber2 = new MessageSubscriber("lakshman");
	
	Subscriber subscriber3 = new MessageSubscriber("fake");
	
	publisher.subscribe(subscriber1);
	publisher.subscribe(subscriber2);
	publisher.subscribe(subscriber3);
	
	publisher.changeState("rama charit manas");
	
	System.out.println("===============");
	
	publisher.unsubscribe(subscriber3);
	
	publisher.changeState("ramayan");
}
}
