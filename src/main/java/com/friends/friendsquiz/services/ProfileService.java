package com.friends.friendsquiz.services;

import com.friends.friendsquiz.models.Profile;

import java.util.List;

/**
 * This interface is to handle the profile related business logic.
 */
public interface ProfileService {
        /**
         * Method to get profile by given id.
         *
         * @param id Primary key of profile
         * @return Profile object
         */
        Profile getProfileById(Long id);

        /**
         * Method to get all the profiles list.
         *
         * @return List of Profile
         */
        List<Profile> getAllProfiles();
}
