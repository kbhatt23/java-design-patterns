package pushAndPullBoth;

public class PushBasedClient {
public static void main(String[] args) {
	Publisher publisher = new StateMessagePublisher("sita-ram");
	
	Listener hanuman = new MessageListener("hanuman");
	
	Listener lakshman = new MessageListener("lakshman");
	
	publisher.subscribe(hanuman);
	publisher.subscribe(lakshman);
	
	publisher.publishState("jai shree ram");
	
	System.out.println("t=======================another try=========");
	//contract is forced
	//there is no change ye
	publisher.notifyUpdate();
	
	System.out.println("t=======================good try=========");
	publisher.publishState("jai raghupati raghav raja ram");
}
}
