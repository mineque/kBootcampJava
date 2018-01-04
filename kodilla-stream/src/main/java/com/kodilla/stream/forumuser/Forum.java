package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> users = new ArrayList<>();

    public Forum() {
        users.add(new ForumUser(1,"user1",'F', 1980, 10,20,0));
        users.add(new ForumUser(2,"user2",'M', 1990, 10,20,1));
        users.add(new ForumUser(3,"user3",'F', 2000, 10,20,4));
        users.add(new ForumUser(4,"user4",'m', 1986, 10,20,0));
        users.add(new ForumUser(5,"user5",'m', 1999, 10,20,0));
        users.add(new ForumUser(6,"user6",'f', 1995, 10,20,3));
        users.add(new ForumUser(7,"user7",'f', 2001, 10,20,2));
        users.add(new ForumUser(8,"user8",'M', 2002, 10,20,1));

    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(users);
    }


}
