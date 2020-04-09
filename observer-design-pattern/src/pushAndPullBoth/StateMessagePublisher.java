package pushAndPullBoth;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StateMessagePublisher implements Publisher{
	private String publisherName;
	
	//for demonstration using state as string
	private String state;
	
	//extra property hidden from contract just to cofirm if notification is needed
	//notifyUpdate method is open for client
	//so forceful call should block actualy notification
	
	//notification should only be sent when there is actual change in state
	
	private boolean changed;
	
	private List<Listener> subscribedListeners;
	
	public StateMessagePublisher(String publisherName) {
		this.publisherName = publisherName;
		//lazy init
		subscribedListeners = new ArrayList<Listener>();
	}

	@Override
	public void subscribe(Listener listener) {

		if(!subscribedListeners.contains(listener)) {
			System.out.println("adding listener "+listener +" to publisher "+publisherName);
			subscribedListeners.add(listener);
			}
	}

	@Override
	public void unsubscribe(Listener listener) {
		System.out.println("removing listener "+listener +" from publisher "+publisherName);
	}

	@Override
	public void notifyUpdate() {
		//this is public methoid
		//we should notify when actually there is a change
		if(!changed) {
			System.out.println("There is no change to tranmsit to listeners for publisher "+publisherName);
			return;
		}
		//copying main arraylist 
		//so that in actual arraylist at the same time new listeners can subscribe
		System.out.println("Transmitting state message to all listerns for publisher "+publisherName);
		List<Listener> copyOfListernes = this.subscribedListeners.stream()
								.collect(Collectors.toList());
		for(Listener listenerEntry :copyOfListernes) {
			listenerEntry.recieveMessage(state);
		}
		//making change back to false
		changed = false;
	}

	@Override
	public void publishState(String state) {
		System.out.println("Request enters to publish state for publisher "+publisherName + " with value state "+state);
		
		this.state=state;
		this.changed=true;
		notifyUpdate();
	}

	@Override
	public String publisStateNow() {
		return this.state;
	}

	@Override
	public String toString() {
		return "StateMessagePublisher [publisherName=" + publisherName + "]";
	}

	
}
