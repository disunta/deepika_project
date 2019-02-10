package org.deepika.jersey.messanger.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.deepika.jersey.messanger.database.DatabaseHelper;
import org.deepika.jersey.messanger.model.Profile;

public class ProfileServices {
	Map<String, Profile> allProfiles = DatabaseHelper.getAllProfiles();

	public ProfileServices() {
		allProfiles.put("deepika_g", new Profile("deepika_g", "deep", "gedela", 1));
		allProfiles.put("Krishna_P", new Profile("Krishna_P", "Kitti", "Pogiri", 2));
	}

	public List<Profile> getAllProfiles() {
		List<Profile> list = new ArrayList<Profile>(allProfiles.values());
		return list;
	}
	public Profile getProfile(String profileName){
		return allProfiles.get(profileName);
	}
	
	public String addProfile(Profile profile){
		profile.setId(allProfiles.size()+1);
		allProfiles.put(profile.getProfileName(), profile);
		return "added succesfully";
	}
}
