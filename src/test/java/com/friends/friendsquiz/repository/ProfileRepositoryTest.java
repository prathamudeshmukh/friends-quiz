package com.friends.friendsquiz.repository;

import com.friends.friendsquiz.models.Profile;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;


import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ProfileRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private ProfileRepository profileRepository;

    @Test
    public void whenFindById_thenReturnProfile(){
        //Given
        Profile profile = new Profile("Prathamesh", "Pratham", "pratham@quiz.com");
        entityManager.persist(profile);
        entityManager.flush();

        Profile found = profileRepository.findById(profile.getId());

        assertThat(found.getId()).isEqualTo(profile.getId());
    }
}
