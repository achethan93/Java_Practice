package com.java.collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueClasses {
    public static void main(String[] args) {

        // LinkedList class
        LinkedList<String> fruitsLinkedList = new LinkedList<>();
        // add fruits to the queue
        fruitsLinkedList.add("Apple");
        fruitsLinkedList.add("Banana");
        fruitsLinkedList.add("Cherry");
        fruitsLinkedList.add("Durian");

        // create a new Queue using the LinkedList
        Queue<String> fruitsQueue = new LinkedList<>(fruitsLinkedList);

        // print the Queue
        System.out.println("Fruit Queue: " + fruitsQueue);

        // get the size of the Queue
        int queueSizeQ = fruitsQueue.size();
        System.out.println("Queue Size: " + queueSizeQ);

        // get the first element of the Queue without removing it
        String firstFruitQ = fruitsQueue.peek();
        System.out.println("First Fruit in Queue: " + firstFruitQ);

        // remove the first element from the Queue
        String removedFruitQ = fruitsQueue.poll();
        System.out.println("Removed Fruit from Queue: " + removedFruitQ);

        // add a fruit to the end of the Queue
        fruitsQueue.offer("Elderberry");
        System.out.println("Fruit Queue after Adding Elderberry: " + fruitsQueue);

        // PriorityQueue class
        Queue<String> fruitsPriorityQueue = new PriorityQueue<>();
        // add fruits to the PriorityQueue
        fruitsPriorityQueue.add("Cherry");
        fruitsPriorityQueue.add("Banana");
        fruitsPriorityQueue.add("Apple");
        fruitsPriorityQueue.add("Durian");

        // print the PriorityQueue
        System.out.println("Fruit PriorityQueue: " + fruitsPriorityQueue);

        // get the size of the PriorityQueue
        int queueSizePQ = fruitsPriorityQueue.size();
        System.out.println("PriorityQueue Size: " + queueSizePQ);

        // get the first element of the PriorityQueue without removing it
        String firstFruitPQ = fruitsPriorityQueue.peek();
        System.out.println("First Fruit in PriorityQueue: " + firstFruitPQ);

        // remove the first element from the PriorityQueue
        String removedFruitPQ = fruitsPriorityQueue.poll();
        System.out.println("Removed Fruit from PriorityQueue: " + removedFruitPQ);

        // add a fruit to the PriorityQueue
        fruitsPriorityQueue.offer("Elderberry");
        System.out.println("Fruit PriorityQueue after Adding Elderberry: " + fruitsPriorityQueue);
    }
}
