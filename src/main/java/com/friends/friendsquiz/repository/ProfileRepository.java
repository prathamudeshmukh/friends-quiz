package com.friends.friendsquiz.repository;

import org.springframework.data.repository.CrudRepository;

import com.friends.friendsquiz.models.Profile;

import java.util.List;

/**
 * This class will handle Profile related db operations.
 */
public interface ProfileRepository extends CrudRepository<Profile, Long> {

    /**
     * Find profile by id.
     * @param id Profile id
     * @return Profile
     */
    Profile findById(Long id);

    /**
     * List all profiles.
     * @return List of Profiles
     */
    List<Profile> findAll();

}
