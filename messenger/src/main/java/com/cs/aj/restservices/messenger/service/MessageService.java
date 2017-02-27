package com.cs.aj.restservices.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.cs.aj.restservices.messenger.database.DatabaseClass;
import com.cs.aj.restservices.messenger.model.Message;

public class MessageService {

	private Map<Long, Message> messages = DatabaseClass.getMessages();

	public MessageService() {
		Message message1 = new Message(1, "Hello AJ", "AJ");
		Message message2 = new Message(2, "Hello Harshu", "AJ");

		messages.put(message1.getId(), message1);
		messages.put(message2.getId(), message2);
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
		messages.put(messageToUpdate.getId(), messageToUpdate);
		return messageToUpdate;
	}

	public Message removeMessage(long id) {
		return messages.remove(id);
	}

}
