package com.java.exceptions;

public class ThrowExample {
    static void checkEligibilty(int age){
        System.out.println("Age: " + age);
        try{
            if(age<15) {
                //explicitly thrown an ArithmeticException with a message under a condition
                throw new ArithmeticException("The Student is not eligible for examination");
            }
            else {
                System.out.println("The Student is Eligible!");
            }
        }
        catch(ArithmeticException e) {
            //enclosed it in a try-catch block and display the message of the exception using the in-built method getMessage()
            //we can define custom errors using the throw keyword
            System.out.println(e.getMessage());
        }
    }
    public static void main(String args[]){
        System.out.println("Let's find out your eligibility!");
        checkEligibilty(12);
        System.out.println("Thank you");
    }
}