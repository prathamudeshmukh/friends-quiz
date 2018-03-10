package com.friends.friendsquiz.seeders;

import com.friends.friendsquiz.models.Profile;
import com.friends.friendsquiz.repository.ProfileRepository;
import com.github.javafaker.Faker;
import com.github.javafaker.Name;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Component
public class DatabaseSeeder {

//    private Logger logger = Logger.getLogger(DatabaseSeeder.class);
    private ProfileRepository profileRepository;
    private Faker faker;
    private static int TOTAL_NUMBER_OF_PROFILES = 10;

    @Autowired
    public DatabaseSeeder(
            ProfileRepository profileRepository,
            JdbcTemplate jdbcTemplate) {
        this.profileRepository = profileRepository;
        faker = new Faker();
    }

    @EventListener
    public void seed(ContextRefreshedEvent event) {
        seedProfilesTable();
    }

    private void seedProfilesTable() {
        List<Profile> allProfiles = new ArrayList<Profile>();
        for(int i=0; i<TOTAL_NUMBER_OF_PROFILES; i++){
            Name name = faker.name();
           allProfiles.add(new Profile(name.fullName(), name.username(), name.username()+"@mail.cc"));
        }
        profileRepository.save(allProfiles);
    }

}
