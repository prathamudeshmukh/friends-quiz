package com.friends.friendsquiz.services;

import com.friends.friendsquiz.models.Profile;

import java.util.List;

public interface ProfileService {

        public Profile getProfileById(Long id);
        public List<Profile> getAllProfiles();
}
