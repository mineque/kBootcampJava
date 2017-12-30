package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test case: begin");
    }
    @After
    public void after(){
        System.out.println("Test case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        OddNumbersExterminator ex = new OddNumbersExterminator();
        ArrayList<Integer> Ints = new ArrayList<Integer>();
        ex.exterminate(Ints);

    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        OddNumbersExterminator ex = new OddNumbersExterminator();
        ArrayList<Integer> Ints = new ArrayList<Integer>();
        for(int i = 0; i<101; i++){
            Ints.add(i);
        }
        ArrayList<Integer>  result = ex.exterminate(Ints);
        System.out.println(result);
    }
}
