package com.java.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapClasses {
    public static void main(String[] args) {
        // Map interface
        Map<Integer, String> fruitsMap = new HashMap<>();
        fruitsMap.put(1, "apple");
        fruitsMap.put(2, "banana");
        fruitsMap.put(3, "orange");
        System.out.println("Map: " + fruitsMap);

        // HashMap class
        Map<String, Integer> fruitsHashMap = new HashMap<>();
        // add fruits to the HashMap with their quantities
        fruitsHashMap.put("Apple", 3);
        fruitsHashMap.put("Banana", 5);
        fruitsHashMap.put("Cherry", 2);
        fruitsHashMap.put("Durian", 1);

        // Print the contents of the HashMap
        System.out.println("HashMap: " + fruitsHashMap);

        // get the size of the HashMap
        System.out.println("Size of HashMap: " + fruitsHashMap.size());

        // get the quantity of a fruit in the HashMap
        int quantityOfBananaHM = fruitsHashMap.get("Banana");
        System.out.println("Quantity of Banana: " + quantityOfBananaHM);

        // check if the HashMap contains a fruit
        boolean containsCherryHM = fruitsHashMap.containsKey("Cherry");
        System.out.println("HashMap contains Cherry: " + containsCherryHM);

        // remove a fruit from the HashMap
        fruitsHashMap.remove("Durian");
        System.out.println("HashMap after removing a fruit: " + fruitsHashMap);

        // iterate over the HashMap using a for-each loop
        System.out.println("Fruits in HashMap:");
        for (String fruit : fruitsHashMap.keySet()) {
            int quantity = fruitsHashMap.get(fruit);
            System.out.println(fruit + " (Quantity: " + quantity + ")");
        }

        // clear the HashMap
        fruitsHashMap.clear();
        System.out.println("Cleared HashMap: " + fruitsHashMap);

        // LinkedHashMap class
        Map<String, Integer> fruitsLinkedHashMap = new LinkedHashMap<>();
        // add fruits to the LinkedHashMap with their quantities
        fruitsLinkedHashMap.put("Apple", 3);
        fruitsLinkedHashMap.put("Banana", 5);
        fruitsLinkedHashMap.put("Cherry", 2);
        fruitsLinkedHashMap.put("Durian", 1);

        // Print the contents of the LinkedHashMap
        System.out.println("LinkedHashMap: " + fruitsLinkedHashMap);

        // get the size of the LinkedHashMap
        System.out.println("Size of LinkedHashMap: " + fruitsLinkedHashMap.size());

        // get the quantity of a fruit in the LinkedHashMap
        int quantityOfBananaLHM = fruitsLinkedHashMap.get("Banana");
        System.out.println("Quantity of Banana: " + quantityOfBananaLHM);

        // check if the LinkedHashMap contains a fruit
        boolean containsCherryLHM = fruitsLinkedHashMap.containsKey("Cherry");
        System.out.println("LinkedHashMap contains Cherry: " + containsCherryLHM);

        // remove a fruit from the LinkedHashMap
        fruitsLinkedHashMap.remove("Durian");
        System.out.println("LinkedHashMap after removing a fruit: " + fruitsLinkedHashMap);

        // iterate over the LinkedHashMap using a for-each loop
        System.out.println("Fruits in LinkedHashMap:");
        for (String fruit : fruitsLinkedHashMap.keySet()) {
            int quantity = fruitsLinkedHashMap.get(fruit);
            System.out.println(fruit + " (Quantity: " + quantity + ")");
        }

        // clear the LinkedHashMap
        fruitsLinkedHashMap.clear();
        System.out.println("Cleared LinkedHashMap: " + fruitsLinkedHashMap);

        // TreeMap class
        Map<String, Integer> fruitsTreeMap = new TreeMap<>();
        // add fruits to the TreeMap with their quantities
        fruitsTreeMap.put("Apple", 3);
        fruitsTreeMap.put("Banana", 5);
        fruitsTreeMap.put("Cherry", 2);
        fruitsTreeMap.put("Durian", 1);

        // Print the contents of the TreeMap
        System.out.println("TreeMap: " + fruitsTreeMap);

        // get the size of the TreeMap
        System.out.println("Size of TreeMap: " + fruitsTreeMap.size());

        // get the quantity of a fruit in the TreeMap
        int quantityOfBananaTM = fruitsTreeMap.get("Banana");
        System.out.println("Quantity of Banana: " + quantityOfBananaTM);

        // check if the TreeMap contains a fruit
        boolean containsCherryTM = fruitsTreeMap.containsKey("Cherry");
        System.out.println("TreeMap contains Cherry: " + containsCherryTM);

        // remove a fruit from the TreeMap
        fruitsTreeMap.remove("Durian");
        System.out.println("TreeMap after removing a fruit: " + fruitsTreeMap);

        // iterate over the TreeMap using a for-each loop
        System.out.println("Fruits in TreeMap:");
        for (String fruit : fruitsTreeMap.keySet()) {
            int quantity = fruitsTreeMap.get(fruit);
            System.out.println(fruit + " (Quantity: " + quantity + ")");
        }

        // clear the TreeMap
        fruitsTreeMap.clear();
        System.out.println("Cleared TreeMap: " + fruitsTreeMap);
    }
}
