package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(1.15, 0.10);
        } catch (Exception e) {
            System.out.println("Catched exception");
        } finally {
            System.out.println("Finished");
        }
    }

}
