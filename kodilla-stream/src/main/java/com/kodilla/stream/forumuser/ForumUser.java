package com.kodilla.stream.forumuser;


/*
Aby zrealizować zadanie wykonaj:

Stwórz w katalogu src/main/java pakiet com.kodilla.stream.forumuser, a w nim klasę ForumUser
Klasa ForumUser powinna mieć następujące pola (użyj odpowiednich nazw angielskich):
unikalny identyfikator użytkownika (typu int)
nazwa użytkownika (typu String)
płeć (typu char), z wartościami ‘M’/’F’
data urodzenia (typu LocalDate)
ilość opublikowanych postów (typu int)

W tym samym pakiecie napisz klasę Forum, która będzie zawierała listę użytkowników, czyli listę obiektów ForumUser.
Klasa Forum powinna udostępniać metodę getUserList(), która będzie zwracała kolekcję z użytkownika forum

W metodzie main(String[] args) klasy StreamMain napisz program, który:
zainicjuje strumień Stream przy pomocy metody stream() kolekcji
odfiltruje tylko tych użytkowników, którzy są mężczyznami
odfiltruje tylko tych użytkowników, którzy mają co najmniej 20 lat
odfiltruje tylko tych użytkowników, którzy mają co najmniej jeden opublikowany post
przy pomocy kolektora utworzy mapę par, w której rolę klucza będzie pełnił unikalny identyfikator użytkownika
wyświetli otrzymaną mapę wynikową
*/

import java.time.LocalDate;

public final class ForumUser {
        private final int userId;
        private final String username;
        private final char sex;
        private LocalDate bDay = null;
        private final int postCounter;


    public ForumUser(int userId, String username, final char sex, final int year, final int month, final int
            dayOfMonth, int postCounter) {
        this.userId = userId;
        this.username = username;
        switch (sex) {
            case 'M':
            case 'F':
            case 'm':
            case 'f':
                this.sex = sex;
                break;
            default:
                this.sex = '0';

        }
        this.bDay = LocalDate.of(year, month, dayOfMonth);
        this.postCounter = postCounter;

    }

    public char getSex() {
        return sex;
    }

    public int getBYear() {
        return this.bDay.getYear();
    }

    public int getPostCounter() {
        return postCounter;
    }

    public int getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", bDay=" + bDay +
                ", postCounter=" + postCounter +
                '}';
    }
}
