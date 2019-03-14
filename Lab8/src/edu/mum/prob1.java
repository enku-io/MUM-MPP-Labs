package edu.mum;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class prob1 {
    static BiFunction<Double,Double, List> addPowToList = (x,y) -> {
        List<Double> list = new ArrayList<>();
        list.add(Math.pow(x, y));
        list.add(x * y);
        return list;
    };
    public static void main (String[] args){
        System.out.println(addPowToList.apply(2.0,3.0));
    }
}
