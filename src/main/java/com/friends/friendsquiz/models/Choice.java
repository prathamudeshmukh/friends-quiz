package com.friends.friendsquiz.models;

import lombok.Data;

import javax.persistence.*;

@Data @Entity
public class Choice {

    @Id @GeneratedValue
    private Long id;

    @OneToOne @JoinColumn(name = "questionid")
    private Question question;
    private boolean isAnswer;

    public Choice(Question question, boolean isAnswer){
        this.question = question;
        this.isAnswer = isAnswer;
    }
}
