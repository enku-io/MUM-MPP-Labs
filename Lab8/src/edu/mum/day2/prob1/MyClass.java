package edu.mum.day2.prob1;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MyClass {
    private String x;
    private String y;

    public static void main(String[] args) {
        MyClass x = new MyClass("x","y");
        MyClass y = new MyClass("x","y");
        System.out.println(x.myMethod(y));
    }

    public MyClass(String x, String y) {
        this.x = x;
        this.y = y;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }
    @Override
    public boolean equals(Object obj){
        if(obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;
        MyClass x = (MyClass)obj;
        return this.x.compareTo(x.getX()) == 0 && this.y.compareTo(x.getY()) == 0;
    }

    public Boolean myMethod(MyClass test){
        Function<Object,Boolean> isEquals = this::equals;
        return isEquals.apply(test);
    }
}
