package com.kodilla.patterns.strategy.social;

public class Millenials extends User {
    public Millenials(String username) {
        super(username);
        super.setPublisher(new TwitterPublisher());
    }
}
