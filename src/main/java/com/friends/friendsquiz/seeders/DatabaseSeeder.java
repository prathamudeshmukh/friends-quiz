package com.friends.friendsquiz.seeders;

import com.friends.friendsquiz.models.Profile;
import com.friends.friendsquiz.repository.ProfileRepository;
import com.github.javafaker.Faker;
import com.github.javafaker.Name;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * This class will handle all the test data to seed.
 */
@Component
public class DatabaseSeeder {

    /**
     * Profile repository object.
     */
    private ProfileRepository profileRepository;

    /**
     * Faker object to generate name, address attress.
     */
    private Faker faker;

    /**
     * Number of fake profiles to be generated.
     */
    private static final int TOTAL_NUMBER_OF_PROFILES = 10;

    /**
     * Default constructor.
     * @param profileRepository Profile repository
     */
    @Autowired
    public DatabaseSeeder(
            final ProfileRepository profileRepository
    ) {
        this.profileRepository = profileRepository;
        faker = new Faker();
    }

    /**
     * Event listener.
     * @param event On which event this method will be handled
     */
    @EventListener
    @SuppressWarnings("checkstyle:designforextension")
    public void seed(final ContextRefreshedEvent event) {
        seedProfilesTable();
    }

    /**
     * This method will handle the table seeding with data.
     */
    private void seedProfilesTable() {
        List<Profile> allProfiles = new ArrayList<Profile>();
        for (int i = 0; i < TOTAL_NUMBER_OF_PROFILES; i++) {
            Name name = faker.name();
           allProfiles.add(
                   new Profile(
                           name.fullName(),
                           name.username(),
                           name.username() + "@mail.cc"
                   )
           );
        }
        profileRepository.save(allProfiles);
    }

}
