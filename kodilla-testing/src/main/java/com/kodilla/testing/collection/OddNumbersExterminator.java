package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    private List<Integer> evenOnly = new ArrayList<>();

    public OddNumbersExterminator() {
    }

    public List<Integer> exterminate(final ArrayList<Integer> numbers){
        for (int i = 0; i < numbers.size(); i++) {
            Integer x = numbers.get(i);
            if (x % 2 != 0) {
                evenOnly.add(numbers.get(i));
            }
        }
        return evenOnly;
    }
}
