package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calc = new Calculator();

        int resultA = calc.add(2,3);

        if( resultA == 5) {
            System.out.println("Result OK");
        } else {
            System.out.println("Something went wrong!");
        }

        int resultB = calc.substract(4,3);

        if( resultB == -1) {
            System.out.println("Result OK");
        } else {
            System.out.println("Something went wrong!");
        }

    }
}