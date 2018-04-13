package com.friends.friendsquiz.models;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


/**
 * Entity class which handles the stored choices of a particular question.
 */
@Data @Entity
public class Choice {

    /**
     * Primary key.
     */
    @Id
    @GeneratedValue
    private Long id;

    /**
     * One to one mapping with the question.
     */
    @OneToOne
    @JoinColumn(name = "questionid")
    private Question question;

    /**
     * If this choice is the right answer.
     */
    private boolean isAnswer;

    /**
     * Constructor to initialize the Choice object.
     * @param question Question to be set
     * @param isAnswer If this is the answer.
     */
    public Choice(final Question question, final boolean isAnswer) {
        this.question = question;
        this.isAnswer = isAnswer;
    }
}
