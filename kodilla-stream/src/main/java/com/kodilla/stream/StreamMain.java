package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum newForum = new Forum();

        Map<Integer,ForumUser> theResultMapOfUsers = newForum.getUserList().stream()
                .filter(forum -> forum.getSex() == 'm' || forum.getSex() == 'M')
                .filter(forum -> forum.getBYear() <= 1998)
                .filter(forum -> forum.getPostCounter() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, forum -> forum));

        System.out.println("# elements: " + theResultMapOfUsers.size());
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);


    }
}