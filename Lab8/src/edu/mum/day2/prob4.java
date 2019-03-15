package edu.mum.day2;

import java.util.Arrays;

public class prob4 {
    public static void main(String[] args) {
        String[] names = {"Alexis", "Tim", "Kyleen", "KRISTY"};
        Arrays.sort(names,String::compareToIgnoreCase);
        System.out.println(Arrays.asList(names));
    }
}
