package com.kodilla.spring.library;

import com.kodilla.spring.calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calc = context.getBean(Calculator.class);
        //When
        double add = calc.add(3.3, 3.9);
        double sub = calc.sub(3.3, 3.9);
        double mul = calc.mul(3.3, 3.9);
        double div = calc.div(3.3, 3.9);
        //Then
        Assert.assertEquals(7.2, add, 0.1);
        Assert.assertEquals(-0.6, sub, 0.1);
        Assert.assertEquals(12.87, mul, 0.01);
        Assert.assertEquals(0.846, div, 0.01);
        //do nothing
    }
}