package com.friends.friendsquiz.controllers;

import com.friends.friendsquiz.models.Question;
import com.friends.friendsquiz.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.rmi.runtime.Log;

import javax.validation.Valid;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api")
public class QuestionsController {
    @Autowired
    private QuestionService questionService;

    @PostMapping("/question")
    public Question setQuestion(@RequestBody Question question)
    {

        return questionService.createQuestion(question);
    }
//    private
}
