package com.cs.aj.restservices.messenger.database;

import java.util.HashMap;
import java.util.Map;

import com.cs.aj.restservices.messenger.model.Message;
import com.cs.aj.restservices.messenger.model.Profile;

public class DatabaseClass {

	private static Map<Long, Message> messages = new HashMap<Long, Message>();
	private static Map<Long, Profile> profiles = new HashMap<Long, Profile>();

	static {
		Message message1 = new Message(1, "Hello AJ", "AJ");
		Message message2 = new Message(2, "Hello Harshu", "AJ");

		messages.put(message1.getId(), message1);
		messages.put(message2.getId(), message2);
	}
	
	public static Map<Long, Message> getMessages() {
		return messages;
	}

	public static Map<Long, Profile> getProfiles() {
		return profiles;
	}

}
