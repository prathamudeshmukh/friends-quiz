package com.friends.friendsquiz.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data @Entity
public class Profile {

    @Id @GeneratedValue
    private Long id;

    private String name;
    private String nickname;
    private String emailid;

    public Profile(String name, String nickname, String emailid){
        this.name = name;
        this.nickname = nickname;
        this.emailid = emailid;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmailid() {
        return this.emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }
}
