package com.friends.friendsquiz.models;

import lombok.Data;

import javax.persistence.*;

@Data @Entity
public class Question {

    @Id @GeneratedValue
    private Long id;
    @OneToOne
    @JoinColumn(name = "profileid")
    private Profile profile;
    private String question;

    public Question(String question, Profile profile){
        this.question = question;
        this.profile = profile;
    }
}
