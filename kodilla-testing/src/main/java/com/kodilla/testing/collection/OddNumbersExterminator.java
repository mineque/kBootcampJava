package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    private ArrayList<Integer> exterminator;
    private ArrayList<Integer> evenOnly;

    public OddNumbersExterminator() {
    }

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        this.exterminator = numbers;
        for (int i = 0; i < numbers.size(); i++) {
            Integer x = numbers.get(i);
            if (x % 2 != 0) {
                numbers.remove(i);
            }
        }
        return numbers;
    }
}
