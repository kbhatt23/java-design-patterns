package pushAndPullBoth;

public interface PullableListener extends Listener{
	//each pullable listner should set the message publiusher
	void setMessagePublisher(Publisher publisher);
	
	void pullStateUpdate();
}
