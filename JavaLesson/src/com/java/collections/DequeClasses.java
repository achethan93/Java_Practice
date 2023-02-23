package com.java.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeClasses {
    public static void main(String[] args) {
        // ArrayDeque class
        Deque<String> fruitArrayDeque = new ArrayDeque<>();
        // add fruits to the front of the ArrayDeque
        fruitArrayDeque.offerFirst("Cherry");
        fruitArrayDeque.offerFirst("Banana");
        fruitArrayDeque.offerFirst("Apple");
        System.out.println("Fruit ArrayDeque after adding to the front: " + fruitArrayDeque);

        // add fruits to the back of the ArrayDeque
        fruitArrayDeque.offerLast("Durian");
        fruitArrayDeque.offerLast("Elderberry");
        System.out.println("Fruit ArrayDeque after adding to the back: " + fruitArrayDeque);

        // get the first element of the ArrayDeque without removing it
        String firstFruit = fruitArrayDeque.peekFirst();
        System.out.println("First Fruit in ArrayDeque: " + firstFruit);

        // get the last element of the ArrayDeque without removing it
        String lastFruit = fruitArrayDeque.peekLast();
        System.out.println("Last Fruit in ArrayDeque: " + lastFruit);

        // remove the first element from the ArrayDeque
        String removedFruit = fruitArrayDeque.pollFirst();
        System.out.println("Removed Fruit from ArrayDeque: " + removedFruit);

        // remove the last element from the ArrayDeque
        removedFruit = fruitArrayDeque.pollLast();
        System.out.println("Removed Fruit from ArrayDeque: " + removedFruit);

        // print the ArrayDeque
        System.out.println("Fruit ArrayDeque after removing elements: " + fruitArrayDeque);

        // LinkedList class
        Deque<String> linkedList = new LinkedList<>();
        linkedList.addFirst("apple");
        linkedList.addLast("banana");
        linkedList.addLast("orange");
        System.out.println("LinkedList: " + linkedList);
    }
}
