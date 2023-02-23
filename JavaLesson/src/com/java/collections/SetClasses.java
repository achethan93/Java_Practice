package com.java.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClasses {
    public static void main(String[] args) {
        // Set interface
        Set<String> fruitsSet = new HashSet<>();
        fruitsSet.add("apple");
        fruitsSet.add("banana");
        fruitsSet.add("orange");
        System.out.println("Set: " + fruitsSet);

        // HashSet class
        Set<String> fruitsHashSet = new HashSet<>();
        // add fruits to the HashSet
        fruitsHashSet.add("Apple");
        fruitsHashSet.add("Banana");
        fruitsHashSet.add("Cherry");
        fruitsHashSet.add("Durian");

        // Print the contents of the HashSet
        System.out.println("HashSet: " + fruitsHashSet);

        // get the size of the HashSet
        System.out.println("Size of HashSet: " + fruitsHashSet.size());

        // check if the HashSet contains a fruit
        boolean containsBananaHS = fruitsHashSet.contains("Banana");
        System.out.println("HashSet contains Banana: " + containsBananaHS);

        // remove a fruit from the HashSet
        fruitsHashSet.remove("Cherry");
        System.out.println("HashSet after removing a fruit: " + fruitsHashSet);

        // iterate over the HashSet using a for-each loop
        System.out.println("Fruits in HashSet:");
        for (String fruit : fruitsHashSet) {
            System.out.println(fruit);
        }

        // clear the HashSet
        fruitsHashSet.clear();
        System.out.println("Cleared HashSet: " + fruitsHashSet);

        // LinkedHashSet class
        Set<String> fruitsLinkedHashSet = new LinkedHashSet<>();
        // add fruits to the LinkedHashSet
        fruitsLinkedHashSet.add("Apple");
        fruitsLinkedHashSet.add("Banana");
        fruitsLinkedHashSet.add("Cherry");
        fruitsLinkedHashSet.add("Durian");

        // Print the contents of the LinkedHashSet
        System.out.println("LinkedHashSet: " + fruitsLinkedHashSet);

        // get the size of the LinkedHashSet
        System.out.println("Size of LinkedHashSet: " + fruitsLinkedHashSet.size());

        // check if the LinkedHashSet contains a fruit
        boolean containsBananaLHS = fruitsLinkedHashSet.contains("Banana");
        System.out.println("LinkedHashSet contains Banana: " + containsBananaLHS);

        // remove a fruit from the LinkedHashSet
        fruitsLinkedHashSet.remove("Cherry");
        System.out.println("LinkedHashSet after removing a fruit: " + fruitsLinkedHashSet);

        // iterate over the LinkedHashSet using a for-each loop
        System.out.println("Fruits in LinkedHashSet:");
        for (String fruit : fruitsLinkedHashSet) {
            System.out.println(fruit);
        }

        // clear the LinkedHashSet
        fruitsLinkedHashSet.clear();
        System.out.println("Cleared LinkedHashSet: " + fruitsLinkedHashSet);

        // TreeSet class
        Set<String> fruitsTreeSet = new TreeSet<>();

        // add fruits to the TreeSet
        fruitsTreeSet.add("Apple");
        fruitsTreeSet.add("Banana");
        fruitsTreeSet.add("Cherry");
        fruitsTreeSet.add("Durian");

        // Print the contents of the TreeSet
        System.out.println("TreeSet: " + fruitsTreeSet);

        // get the size of the TreeSet
        System.out.println("Size of TreeSet: " + fruitsTreeSet.size());

        // check if the TreeSet contains a fruit
        boolean containsBananaTS = fruitsTreeSet.contains("Banana");
        System.out.println("TreeSet contains Banana: " + containsBananaTS);

        // remove a fruit from the TreeSet
        fruitsTreeSet.remove("Cherry");
        System.out.println("TreeSet after removing a fruit: " + fruitsTreeSet);

        // iterate over the TreeSet using a for-each loop
        System.out.println("Fruits in TreeSet:");
        for (String fruit : fruitsTreeSet) {
            System.out.println(fruit);
        }

        // clear the TreeSet
        fruitsTreeSet.clear();
        System.out.println("Cleared TreeSet: " + fruitsTreeSet);

    }
}
