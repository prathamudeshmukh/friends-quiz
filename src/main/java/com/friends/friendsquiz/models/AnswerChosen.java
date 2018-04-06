package com.friends.friendsquiz.models;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * Entity class which handles the stored answer chosen by the user.
 */
@Data @Entity
public class AnswerChosen {

    /**
     * Primary key.
     */
    @Id
    @GeneratedValue
    private Long id;

    /**
     * One to One mapping with the question.
     */
    @OneToOne @JoinColumn(name = "questionid")
    private Question question;

    /**
     * One to one mapping with choices.
     */
    @OneToOne @JoinColumn(name = "choiceid")
    private Choice choice;

    /**
     * One to one mapping with attempted by user profile.
     */
    @OneToOne @JoinColumn(name = "attemptedbyid")
    private Profile profile;
}
