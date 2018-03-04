package com.friends.friendsquiz.models;

import lombok.Data;

import javax.persistence.*;

@Entity @Data
public class AnswerChosen {

    @Id @GeneratedValue
    private Long id;
    @OneToOne @JoinColumn(name = "questionid")
    private Question question;

    @OneToOne @JoinColumn(name = "choiceid")
    private Choice choice;

    @OneToOne @JoinColumn(name = "attemptedbyid")
    private Profile profile;
}
