package com.friends.friendsquiz.models;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


/**
 * Entity class which handles the stored questions.
 */
@Data @Entity
public class Question {

    /**
     * Primary key.
     */
    @Id
    @GeneratedValue
    private Long id;

    /**
     * One to one mapping with user profile.
     */
    @OneToOne
    @JoinColumn(name = "profileid")
    private Profile profile;

    /**
     * Question.
     */
    private String question;

    /**
     * Default constructor.
     * @param question Question
     * @param profile Profile
     */
    public Question(final String question, final Profile profile) {
        this.question = question;
        this.profile = profile;
    }
}
