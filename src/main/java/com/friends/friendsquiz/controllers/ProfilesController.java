package com.friends.friendsquiz.controllers;

import com.friends.friendsquiz.models.Profile;
import com.friends.friendsquiz.services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * This class handles the user profile related endpoints.
 */
@RestController
@RequestMapping("/api")
public class ProfilesController {

    /**
     * DI for profile service.
     * Will need this service to query profile related operations.
     */
    @Autowired
    private ProfileService profileService;

    /**
     * To get all the user profiles.
     *
     * @return List of user profiles
     */
    @GetMapping("/profiles")
    public final List<Profile> getAllProfiles() {
        return profileService.getAllProfiles();
    }
}
