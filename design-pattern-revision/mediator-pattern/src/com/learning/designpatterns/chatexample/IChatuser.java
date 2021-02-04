package com.learning.designpatterns.chatexample;

public interface IChatuser {

	//each object can send message
	void sendMessage(String message);
	
	
	//each object can receive message
	void receiveMessage(String message, IChatuser sender);
}
