package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {

        int[] numbersArray = numbers;

        IntStream.range(0, numbersArray.length)
                .map(n -> numbersArray[n])
                .forEach(System.out::println);

        OptionalDouble average = IntStream.range(0, numbersArray.length)
                .map(n -> numbersArray[n])
                .average();

        double value = average.orElse(0);
        return value;
    }


}
