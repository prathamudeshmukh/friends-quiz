package com.friends.friendsquiz.services;

import com.friends.friendsquiz.models.Profile;
import com.friends.friendsquiz.repository.ProfileRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
public class ProfileServiceImplTest {

    @TestConfiguration
    static class ProfileServiceImplTestContextConfiguration{

        @Bean
        public ProfileService profileService(){
            return new ProfileServiceImpl();
        }
    }

    @Autowired
    private ProfileService profileService;

    @MockBean
    private ProfileRepository profileRepository;

    @Before
    public void setUp(){
        Profile profile = new Profile("prathamesh", "pratham", "pratham@quiz.com");
        Mockito.when(profileRepository.findById(1L)).thenReturn(profile);
        List<Profile> allProfiles = new ArrayList<Profile>();
        allProfiles.add(profile);
        Mockito.when(profileRepository.findAll()).thenReturn(allProfiles);
    }

    @Test
    public void whenValidId_thenProfileShouldBeFound(){
        Profile found = profileService.getProfileById(1L);
        assertThat(found.getName()).isEqualTo("prathamesh");
    }

    @Test
    public void whenRecordsPresent_thenListOfProfilesShouldBeReturned(){
        List<Profile> allProfiles = profileService.getAllProfiles();

        assertThat(allProfiles.size()).isEqualTo(1);
    }

}
