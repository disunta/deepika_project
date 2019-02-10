package org.deepika.jersey.messanger.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Profile {
	private String profileName;
	private String firstName;
	private String lastName;
	private long id;
	
	public Profile(){
		
	}
	
	
	public Profile(String profileName, String firstName, String lastName, long id) {
		super();
		this.profileName = profileName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}
	public String getProfileName() {
		return profileName;
	}
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	

}
