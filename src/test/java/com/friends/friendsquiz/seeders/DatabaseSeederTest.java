package com.friends.friendsquiz.seeders;

import com.friends.friendsquiz.repository.ProfileRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

@RunWith(SpringRunner.class)
@DataJpaTest

public class DatabaseSeederTest {

    @MockBean
    private ProfileRepository profileRepository;

    JdbcTemplate jt = mock(JdbcTemplate.class);

    @Test
    public void createProfile()
    {

        DatabaseSeeder ds= new DatabaseSeeder(profileRepository, jt);
    }
}