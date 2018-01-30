package com.kodilla.patterns.strategy.social;

public class User {

    String username;
    SocialPublisher publisher = null;

    public User(String username) {
        this.username = username;
    }

    public String sharePost(){
        return publisher.share();
    }

    public void setPublisher(SocialPublisher publisher){
        this.publisher = publisher;
    }
}
