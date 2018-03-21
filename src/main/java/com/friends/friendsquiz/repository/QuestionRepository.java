package com.friends.friendsquiz.repository;

import com.friends.friendsquiz.models.Question;
import org.springframework.data.repository.CrudRepository;

public interface QuestionRepository extends CrudRepository<Question, Long>{
    public  Question save(Question question);
}
