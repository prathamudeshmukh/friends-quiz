package com.friends.friendsquiz.repository;

import com.friends.friendsquiz.models.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<Profile, Long>{

    public Profile findById(Long id);

}
