package org.deepika.jersey.messanger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Message {
	private String message;
	private String author;
	private long messageId;
	private Date date;
	
	public Message(){
		
	}
	public Message(String message, String author, long messageId) {
		super();
		this.message = message;
		this.author = author;
		this.messageId = messageId;
		this.date = new Date();
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
	public long getMessageId() {
		return messageId;
	}
	public void setMessageId(long messageId) {
		this.messageId = messageId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	

}
