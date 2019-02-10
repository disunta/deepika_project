package org.deepika.jersey.messanger.database;

import java.util.HashMap;
import java.util.Map;

import org.deepika.jersey.messanger.model.Message;
import org.deepika.jersey.messanger.model.Profile;

public class DatabaseHelper {
	private static Map<Long,Message> messages=new HashMap<>();
	private static Map<String,Profile> profiles=new HashMap<>();
	
	public static Map<Long,Message> getAllMessages(){
		return messages;
	}

	public static Map<String, Profile> getAllProfiles(){
		return profiles;
	}

}
