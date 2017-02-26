package com.cs.aj.restservices.messenger.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {

	private long id;
	private String message;
	private String author;
	
	public Message(){
		//Need this for conversion to JSON. Best practice is to have no argument constructor 
	}

	public Message(long id, String message, String author) {
		this.id = id;
		this.message = message;
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
