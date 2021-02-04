package com.learning.designpatterns.chatexample;

public class ChatUserImpl implements IChatuser {
//do not gold different instance here
	// better keep track on mediator side

	private String userId;
	private ChatMediator chatMediator;

	public ChatUserImpl(String userId, ChatMediator chatMediator) {
		this.userId = userId;
		this.chatMediator = chatMediator;
		//another way to handle and bypass addUser method
		//object will be already constructed as it happens in object class itself, when flow comes back
		//it allows us to modify the state of created object
		this.chatMediator.addUser(this);
	}

	@Override
	public void sendMessage(String message) {
		System.out.println("User "+userId+" sending message "+ message+" to mediator ");
		chatMediator.sendMessage(message,this);
	}

	@Override
	public void receiveMessage(String message,IChatuser sender) {
		System.out.println("User "+userId+" received message "+ message + " from sender "+sender);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChatUserImpl other = (ChatUserImpl) obj;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ChatUserImpl [userId=" + userId + "]";
	}

	
	
}
