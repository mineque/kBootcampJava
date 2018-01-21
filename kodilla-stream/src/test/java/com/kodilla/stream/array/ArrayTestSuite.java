package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayTestSuite {
@Test
    public void PrintTest() {

        //Given
        int[] numbers = {1,3,5,1,10,21};

        //When
        double avg = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(6.83, avg,1);
    }
}
