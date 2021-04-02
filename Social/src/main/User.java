package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
    private Long userId;
    private String name;
    private String email;
    private Date createdOn;
    private List<User> follws;
    private List<User> followers;

    public User(String name){
        this.name = name;
        this.follws = new ArrayList<>();
        this.followers = new ArrayList<>();
        this.createdOn = new Date();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public List<User> getFollws() {
        return follws;
    }

    public void setFollws(List<User> follws) {
        this.follws = follws;
    }

    public List<User> getFollowers() {
        return followers;
    }

    public void setFollowers(List<User> followers) {
        this.followers = followers;
    }
}
