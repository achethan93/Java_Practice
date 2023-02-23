package com.java.basics;

import java.util.ArrayList;

public class ArrayWithForLoop {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55}; //one dimension array
        System.out.println(arr.length); // Length of an array
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]); //printing array values
        }


        // 2D Array
        int[][] arr2d= {
                {11, 22, 33},
                {44, 55, 66}
        };
        System.out.println(arr2d[0][0]);


//        // working with Arraylist
//        ArrayList<String> arrList = new ArrayList<String>(); // Creation of ArrayList with String elements
//
//        arrList.add(0, "TGT"); // Adding elements to the array list
//        arrList.add(1, "TopGrep Tech");
//        arrList.add(2, "students");
//        System.out.println(arrList);
//
//        arrList.remove("students"); //Remove elements from array list like this
//        arrList.add("Champions"); //Remove elements from array list like this
//        System.out.println(arrList);
    }
}
