package com.friends.friendsquiz.services;

import com.friends.friendsquiz.models.Profile;

import java.util.List;

public interface ProfileService {

        Profile getProfileById(Long id);
        List<Profile> getAllProfiles();
}
