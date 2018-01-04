package com.kodilla.stream;

import com.kodilla.stream.person.People;

public class StreamMain {
    public static void main(String[] args) {
      /*  Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is an example text."));

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemo = new PoemBeautifier();

        poemo.beautify("bla bla", (text) -> text.toUpperCase());
        poemo.beautify("bla bla", (text) -> text.toUpperCase());
        poemo.beautify("BLA BLA", (text) -> "aaaa "+text+" bbb");
        poemo.beautify("BLA BLA", (text) -> text.toLowerCase());

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);*/

        People.getList().stream()
                .filter(s -> s.length() > 11)
                .forEach(System.out::println);
    }
}