package edu.mum.day2;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class prob2 {
    public static void main(String[] args) {

        firstProblem();
        secondProblem();
        thirdProblem();

    }

    public static void firstProblem(){
        Stream.generate(Math::random).limit(10).forEach(System.out::println);
    }

    public static void secondProblem(){
        Stream.generate(()->Math.random()).limit(10).forEach((x)->System.out.println(x));
    }

    public static void thirdProblem(){
        Supplier<Double> generate = Math::random;
        Stream.generate(generate).limit(10).forEach(System.out::println);
    }
    public static void fourthProblem(){

    }
}
