package com.friends.friendsquiz.controllers;

import com.friends.friendsquiz.models.Profile;
import com.friends.friendsquiz.services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProfilesController {

    @Autowired
    private ProfileService profileService;

    @GetMapping("/profiles")
    public List<Profile> getAllProfiles(){
        return profileService.getAllProfiles();
    }
}
