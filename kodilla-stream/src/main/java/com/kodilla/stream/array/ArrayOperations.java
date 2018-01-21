package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers){

        int[] numbersArray = numbers;

        IntStream display = IntStream.range(0,numbersArray.length)
                display.forEach(System.out::println);
                double result = display.average(numbersArray[n]);

//        numbersArray.IntStream.range(0,numbersArray.length())
//                .
//                .forEach(System.out::println);
//                .
//    }
//    long numberOfBooksPublicatedAfter2007 = IntStream.range(0, books.size())
//            .filter(n -> books.get(n).getYearOfPublication() > 2007)
//            .count();
//        Assert.assertEquals(3, numberOfBooksPublicatedAfter2007);
    //
//    public BigDecimal getPeopleQuantity(){
//        //
//        return continents.stream()
//                .flatMap(c -> c.getCountries().stream())
//                .map(cnt -> cnt.getPeopleQuantity())
//                .reduce(BigDecimal.ZERO,(sum, delta) -> sum.add(delta));


}
