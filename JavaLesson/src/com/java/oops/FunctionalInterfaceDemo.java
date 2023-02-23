package com.java.oops;
import java.util.function.*;    //built-in function interface
public class FunctionalInterfaceDemo implements Function<Integer, Integer>{
    @Override
    public Integer apply (Integer n){
        return n*n;
    }
    public static void main (String args[]){
        FunctionalInterfaceDemo demo = new FunctionalInterfaceDemo ();
        Integer sqroot= demo.apply(12);
        System.out.println("Square root of 12 is " + sqroot);
    }
}