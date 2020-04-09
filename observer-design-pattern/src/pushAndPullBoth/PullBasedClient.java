package pushAndPullBoth;

public class PullBasedClient {
public static void main(String[] args) {
Publisher publisher = new StateMessagePublisher("sita-ram");
	
	PullableListener hanuman = new MessageListener("hanuman");
	
	PullableListener lakshman = new MessageListener("lakshman");
	
	//no need to subscribe as it is pull based , hwihc is initiated by listenre
	//publisher.subscribe(hanuman);
	//publisher.subscribe(lakshman);
	
	publisher.publishState("jai shree ram");
	
	hanuman.setMessagePublisher(publisher);
	hanuman.pullStateUpdate();
}
}
