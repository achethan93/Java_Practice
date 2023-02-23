package com.java.basics;

public class Variables_all {

    final static int staticVar = 100; // static variable
    int instanceVar = 200; // instance variable

    public static void main(String [] args){

        int localVar = 300; // local variable

        // We can access static variables without creating an Object of a class
        System.out.println("Value of a Static Variable is "+staticVar);

        // We cannot access instance variables without creating an Object of a class
//        System.out.println("Value of a Instance Variable is "+instanceVar);
        // Creating an object of VariablesLocalInstanceClass
        Variables_all var = new Variables_all();
        System.out.println("Value of a Instance Variable is "+var.instanceVar);
        //Updating the value of instanceVar using the object of VariableLocalInstanceClass
        var.instanceVar = 201;
        System.out.println("Updated value of a Instance Variable is "+var.instanceVar);
//
        // Local variables are limited to this method only
        System.out.println("Value of a Local Variable is "+localVar);
        //Updating the value of localVar
        localVar = 301;
        System.out.println("Updated value of a Local Variable is "+localVar);
//
        System.out.println(localVar + localVar);// can use arithmetic operators to display value


    }

}