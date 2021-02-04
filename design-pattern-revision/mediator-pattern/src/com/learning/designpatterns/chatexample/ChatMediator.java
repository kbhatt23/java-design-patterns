package com.learning.designpatterns.chatexample;

import java.util.HashSet;
import java.util.Set;

public class ChatMediator {
	// it must hold all values of user instance

	private Set<IChatuser> users;

	public ChatMediator() {
		users = new HashSet<>();
	}

	public void sendMessage(String message, IChatuser sender) {
		if (users == null || users.size() == 0) {
			// no subscriber available
			throw new IllegalStateException("no subscriber available");
		}

		users.stream().filter(user -> !user.equals(sender)).forEach(user -> user.receiveMessage(message,sender));
		;

	}

	public void addUser(IChatuser user) {
		users.add(user);
	}

}
