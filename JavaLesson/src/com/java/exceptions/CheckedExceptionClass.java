package com.java.exceptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionClass {

    public static void main(String [] args)  {
        try {
            FileInputStream fis = new FileInputStream("D:/TestFile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("TestFile not found");
        }
    }

}