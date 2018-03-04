package com.friends.friendsquiz.repository;

import com.friends.friendsquiz.models.Profile;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProfileRepository extends CrudRepository<Profile, Long>{

    public Profile findById(Long id);
    public List<Profile> findAll();

}
