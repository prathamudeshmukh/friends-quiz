package com.friends.friendsquiz.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Entity class which handles the store user profiles.
 */
@Entity
public class Profile {

    /**
     * Primary key.
     */
    @Id @GeneratedValue
    private Long id;

    /**
     * Name of the user.
     */
    private String name;

    /**
     * Nickname of the user.
     */
    private String nickname;

    /**
     * Email id of the user.
     */
    private String emailid;

    /**
     * The profile constructor which sets all the properties.
     *
     * @param name User name
     * @param nickname nick name
     * @param emailid email id
     */
    public Profile(
            final String name,
            final String nickname,
            final String emailid
    ) {
        this.name = name;
        this.nickname = nickname;
        this.emailid = emailid;
    }

    /**
     * Empty constructor.
     */
    public Profile() {  }

    /**
     * Getter for Id.
     * @return id
     */
    public final Long getId() {
        return this.id;
    }

    /**
     * Getter for name.
     * @return name
     */
    public final String getName() {
        return this.name;
    }

    /**
     * Getter for nickname.
     * @return nickname nickname
     */
    public final String getNickname() {
        return nickname;
    }

    /**
     * Setter for nickname.
     * @param nickname nickname
     */
    public final void setNickname(final String nickname) {
       this.nickname = nickname;
    }

    /**
     * Getter for mailid.
     * @return emailid
     */
    public final String getEmailid() {
        return emailid;
    }

    /**
     * Setter for emailid.
     * @param emailid emailid
     */
    public final void setEmailid(final String emailid) {
        this.emailid = emailid;
    }

}
