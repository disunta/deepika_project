package org.deepika.jersey.messanger.services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.deepika.jersey.messanger.database.DatabaseHelper;
import org.deepika.jersey.messanger.exceptions.GenericExceptions;
import org.deepika.jersey.messanger.model.ErrorMessage;
import org.deepika.jersey.messanger.model.Message;

import com.fasterxml.jackson.databind.deser.std.DateDeserializers.CalendarDeserializer;

public class MessageService {

	Map<Long, Message> allMessages = DatabaseHelper.getAllMessages();

	public MessageService() {
		allMessages.put(1L, new Message("hi", "deepika", 1));
		allMessages.put(2L, new Message("hello", "Krishna", 2));
	}

	public List<Message> getAllMessages() {
		return new ArrayList<Message>(allMessages.values());

	}

	public Message getMessage(long id) {
		Message msg= allMessages.get(id);
		if(msg==null){
			ErrorMessage errorMessage=new ErrorMessage("not found",500,"fjhkjfdg");
			throw new WebApplicationException(Response.status(Status.INTERNAL_SERVER_ERROR).entity(errorMessage).build());
		}
		return msg;
	}

	public Message addMessage(Message message) {
		Message messageee = message;
		Long size = Long.valueOf(allMessages.size()) + 1;
		messageee.setMessageId(size);
		allMessages.put(size, message);
		return message;
		
	}

	public ArrayList<Message> getMessagesByYear(int year) {
		ArrayList<Message> messagesByYear = new ArrayList<>();
		Calendar cal = Calendar.getInstance();

		for (Message message : allMessages.values()) {
			cal.setTime(message.getDate());
			if (cal.get(Calendar.YEAR) == year) {
				messagesByYear.add(message);
			}
		}

		return messagesByYear;

	}

	public String updateMessage(Message message) {
		allMessages.put(message.getMessageId(), message);
		return "Updated Succesfully";
	}

	public String deleteMessage(long messageId) {
		allMessages.remove(messageId);

		return "Deleted Succesfully";
	}

}
