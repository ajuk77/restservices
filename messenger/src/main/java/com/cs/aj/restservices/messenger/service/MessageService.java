package com.cs.aj.restservices.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.cs.aj.restservices.messenger.database.DatabaseClass;
import com.cs.aj.restservices.messenger.model.Message;

public class MessageService {

	private Map<Long, Message> messages = DatabaseClass.getMessages();

	public MessageService() {
	
	}

	public List<Message> getAllMessages() {
		return new ArrayList<Message>(messages.values());
	}

	public Message getMessage(Long id) {
		return messages.get(id);
	}

	public Message addMessage(Message messageToAdd) {
		messageToAdd.setId(messages.size() + 1);
		messages.put(messageToAdd.getId(), messageToAdd);
		return messageToAdd;
	}

	public Message updateMessage(Message messageToUpdate) {
		if (messageToUpdate.getId() <= 0) {
			return null;
		}
		Message obj = messages.get(messageToUpdate.getId());
		System.out.println("Object found " + obj);
		obj.setAuthor(messageToUpdate.getAuthor());
		obj.setMessage(messageToUpdate.getMessage());
		
		messages.put(messageToUpdate.getId(), obj);
		return messages.get(messageToUpdate.getId());
	}

	public Message removeMessage(long id) {
		return messages.remove(id);
	}

}
