package com.cs.aj.restservices.messenger.service;

import java.util.ArrayList;
import java.util.List;

import com.cs.aj.restservices.messenger.model.Message;

public class MessageService {
	
	public List<Message> getAllMessages(){
		List<Message> messages = new ArrayList<Message>();
		
		Message message1 = new Message(1, "HI AJ", "AJ");
		Message message2 = new Message(2, "Hello Jersey", "Jersey");
		
		messages.add(message1);
		messages.add(message2);
		
		return messages; 	 
	}

}
