package com.learning.designpatterns.chatexample;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ChatInitiatorClient {
	public static void main(String[] args) {
		ChatMediator chatMediator = new ChatMediator()
				;
		
		List<ChatUserImpl> allUsers = IntStream.rangeClosed(1, 10)
				.mapToObj(index ->new ChatUserImpl("user-"+index, chatMediator) )
				.collect(Collectors.toList())
				;
		
		allUsers.forEach(user -> chatMediator.addUser(user));
		
		//ChatUserImpl user1 = allUsers.get(0);
		ChatUserImpl user1 = new ChatUserImpl("user-1", chatMediator);
		user1.sendMessage("jai shree ram");
	}

}
