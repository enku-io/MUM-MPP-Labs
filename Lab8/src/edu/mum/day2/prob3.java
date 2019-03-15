package edu.mum.day2;

import java.util.Arrays;
import java.util.List;

public class prob3 {
    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("Apple", "Banana","Orange","Cherries","blums");
        //a
        fruits.stream().forEach((x)->System.out.println(x));
        //b
        fruits.stream().forEach(System.out::println);
    }
}
