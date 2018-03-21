package com.friends.friendsquiz.services;

import com.friends.friendsquiz.models.Question;
import com.friends.friendsquiz.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private  QuestionRepository questionRepository;

    @Override
    public Question createQuestion(Question question) {
        return  questionRepository.save(question);
    }

}
