package com.friends.friendsquiz.services;

import com.friends.friendsquiz.models.Profile;
import com.friends.friendsquiz.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service implementation for ProfileService.
 */
@Service
public class ProfileServiceImpl implements ProfileService {

    /**
     * Profile repository to perform db operations.
     */
    @Autowired
    private ProfileRepository profileRepository;

    /**
     * Get a profile by id.
     *
     * @param id Primary key of profile
     * @return Profile object
     */
    @Override
    public final Profile getProfileById(final Long id) {
        return profileRepository.findById(id);
    }

    /**
     * Get all profiles list.
     *
     * @return List of profile
     */
    @Override
    public final List<Profile> getAllProfiles() {
        return profileRepository.findAll();
    }
}
