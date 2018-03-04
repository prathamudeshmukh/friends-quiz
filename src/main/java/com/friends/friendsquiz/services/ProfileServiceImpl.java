package com.friends.friendsquiz.services;

import com.friends.friendsquiz.models.Profile;
import com.friends.friendsquiz.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProfileServiceImpl implements ProfileService{

    @Autowired
    private ProfileRepository profileRepository;

    @Override
    public Profile getProfileById(Long id){
        return profileRepository.findById(id);
    }

    @Override
    public List<Profile> getAllProfiles(){
        return profileRepository.findAll();
    }
}
