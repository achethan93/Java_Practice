package com.java.collections;

import java.util.*;

public class ListClasses {
    public static void main(String[] args) {
        Collection<String> fruitsCollection = new ArrayList<>();
        fruitsCollection.add("apple");
        fruitsCollection.add("banana");
        fruitsCollection.add("orange");
        System.out.println("Collection: " + fruitsCollection);

        // List Interface
        List<String> fruitsList = new ArrayList<>();
        fruitsList.add("apple");
        fruitsList.add("banana");
        fruitsList.add("orange");
        System.out.println("List: " + fruitsList);

        // ArrayList class
//        Declaring the variable as a List allows for more flexibility,
//        as it can be easily swapped out for other List implementations,
//        while declaring it as an ArrayList provides access to specific ArrayList methods.
        List<String> fruitsArrayList = new ArrayList<>();
        ArrayList<String> arrayList23 = new ArrayList<>();
        // add fruits to the ArrayList
        fruitsArrayList.add("Apple");
        fruitsArrayList.add("Banana");
        fruitsArrayList.add("Cherry");
        fruitsArrayList.add("Durian");

        // Print the contents of the ArrayList
        System.out.println("ArrayList: " + fruitsArrayList);

        // get the size of the ArrayList
        System.out.println("Size of ArrayList: " + fruitsArrayList.size());

        // access a fruit in the ArrayList
        System.out.println("Fruit at index 1: " + fruitsArrayList.get(1));

        // change a fruit in the ArrayList
        fruitsArrayList.set(2, "Elderberry");
        System.out.println("Modified ArrayList: " + fruitsArrayList);

        // remove a fruit from the ArrayList
        fruitsArrayList.remove(3);
        System.out.println("ArrayList after removing a fruit: " + fruitsArrayList);

        // check if the ArrayList contains a fruit
        boolean containsBananaAL = fruitsArrayList.contains("Banana");
        System.out.println("ArrayList contains Banana: " + containsBananaAL);

        // iterate over the ArrayList using a for loop
        System.out.println("Fruits in ArrayList:");
        for (int i = 0; i < fruitsArrayList.size(); i++) {
            System.out.println(fruitsArrayList.get(i));
        }

        // clear the ArrayList
        fruitsArrayList.clear();
        System.out.println("Cleared ArrayList: " + fruitsArrayList);

        // LinkedList class
        List<String> fruitsLinkedList = new LinkedList<>();
        // add fruits to the LinkedList
        fruitsLinkedList.add("Apple");
        fruitsLinkedList.add("Banana");
        fruitsLinkedList.add("Cherry");
        fruitsLinkedList.add("Durian");

        // Print the contents of the LinkedList
        System.out.println("LinkedList: " + fruitsLinkedList);

        // get the size of the LinkedList
        System.out.println("Size of LinkedList: " + fruitsLinkedList.size());

        // access a fruit in the LinkedList
        System.out.println("Fruit at index 1: " + fruitsLinkedList.get(1));

        // change a fruit in the LinkedList
        fruitsLinkedList.set(2, "Elderberry");
        System.out.println("Modified LinkedList: " + fruitsLinkedList);

        // remove a fruit from the LinkedList
        fruitsLinkedList.remove(3);
        System.out.println("LinkedList after removing a fruit: " + fruitsLinkedList);

        // check if the LinkedList contains a fruit
        boolean containsBananaLL = fruitsLinkedList.contains("Banana");
        System.out.println("LinkedList contains Banana: " + containsBananaLL);

        // iterate over the LinkedList using a for loop
        System.out.println("Fruits in LinkedList:");
        for (int i = 0; i < fruitsLinkedList.size(); i++) {
            System.out.println(fruitsLinkedList.get(i));
        }

        // clear the LinkedList
        fruitsLinkedList.clear();
        System.out.println("Cleared LinkedList: " + fruitsLinkedList);

        // Vector class
        List<String> fruitsVector = new Vector<>();
        // add fruits to the Vector
        fruitsVector.add("Apple");
        fruitsVector.add("Banana");
        fruitsVector.add("Cherry");
        fruitsVector.add("Durian");

        // Print the contents of the Vector
        System.out.println("Vector: " + fruitsVector);

        // get the size of the Vector
        System.out.println("Size of Vector: " + fruitsVector.size());

        // access a fruit in the Vector
        System.out.println("Fruit at index 1: " + fruitsVector.get(1));

        // change a fruit in the Vector
        fruitsVector.set(2, "Elderberry");
        System.out.println("Modified Vector: " + fruitsVector);

        // remove a fruit from the Vector
        fruitsVector.remove(3);
        System.out.println("Vector after removing a fruit: " + fruitsVector);

        // check if the Vector contains a fruit
        boolean containsBananaV = fruitsVector.contains("Banana");
        System.out.println("Vector contains Banana: " + containsBananaV);

        // iterate over the Vector using a for loop
        System.out.println("Fruits in Vector:");
        for (int i = 0; i < fruitsVector.size(); i++) {
            System.out.println(fruitsVector.get(i));
        }

        // clear the Vector
        fruitsVector.clear();
        System.out.println("Cleared Vector: " + fruitsVector);

        // Stack class
        Stack<String> fruitsStack = new Stack<>();
        // add fruits to the Stack
        fruitsStack.push("Apple");
        fruitsStack.push("Banana");
        fruitsStack.push("Cherry");
        fruitsStack.push("Durian");

        // Print the contents of the Stack
        System.out.println("Stack: " + fruitsStack);

        // get the size of the Stack
        System.out.println("Size of Stack: " + fruitsStack.size());

        // access the top fruit in the Stack
        System.out.println("Top fruit: " + fruitsStack.peek());

        // remove the top fruit from the Stack
        fruitsStack.pop();
        System.out.println("Stack after removing the top fruit: " + fruitsStack);

        // check if the Stack contains a fruit
        boolean containsBananaS = fruitsStack.contains("Banana");
        System.out.println("Stack contains Banana: " + containsBananaS);

        // iterate over the Stack using a while loop
        System.out.println("Fruits in Stack:");
        while (!fruitsStack.empty()) {
            System.out.println(fruitsStack.pop());
        }

        // clear the Stack
        fruitsStack.clear();
        System.out.println("Cleared Stack: " + fruitsStack);
    }
}
