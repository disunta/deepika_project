package org.deepika.jersey.messanger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.deepika.jersey.messanger.model.Profile;
import org.deepika.jersey.messanger.services.ProfileServices;

@Path("profiles")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class ProfileResource {
	ProfileServices profileServices = new ProfileServices();

	@GET
	public List<Profile> getProfiles() {
		return profileServices.getAllProfiles();

	}
	
	@GET
	@Path("/{profileName}")
	public Profile getProfiles(@PathParam("profileName") String profileName) {
		return profileServices.getProfile(profileName);

	}
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String addProfile(Profile profile){
		return profileServices.addProfile(profile);
	}
		
	}
	


