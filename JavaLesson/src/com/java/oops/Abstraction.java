package com.java.oops;

// Here class is abstract
public abstract class Abstraction {
    public int a = 10; // data members cant be abstract
    abstract void myMethod(); // myMethod() is an abstract method
    void myMethod(int x){   // myMethod(int x) is not an abstract method. Its a concrete method
        System.out.println("I am in Super class and I am not an abstract method. I am a concrete method");
    }
}
    class AbstractChildOneClass extends Abstraction {
    public static void main (String [] args){
        // Here we cannot instantiate the Abstraction class but we can instantiate the Abstract Child Class
        // Using the instance of Abstract Child Class we can access methods and data members of Abstraction class
        Abstraction obj = new AbstractChildOneClass();
        System.out.println("I am a data member from Super class and my value is " + obj.a);
        obj.myMethod();
        obj.myMethod(20);
    }
    @Override
    void myMethod() {

        System.out.println("I am in child class");
    }
}