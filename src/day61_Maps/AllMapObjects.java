package day61_Maps;

import java.util.*;

public class AllMapObjects {
    public static void main(String[] args) {

        // Map is an interface, so we can not create an object from Map, but we can use it as a reference.
        Map<String, String> map = new HashMap<>();
        // This time, key is not a number that is also a string
        // HashMap ==> Random order and allows null.
        map.put("class", "Java");
        map.put("hello", "world");
        map.put("James", "Bond");
        map.put("Aysun", "UI testing");
        map.put("soft skills", "Nadir");
        map.put("userName", "password");
        map.put(null, "nothing");
        System.out.println(map);

        // Puts the key/values in the order that as we provide.
        Map<String, String> linked = new LinkedHashMap<>();
        linked.put("class", "Java");
        linked.put("hello", "world");
        linked.put("James", "Bond");
        linked.put("Aysun", "UI testing");
        linked.put("soft skills", "Nadir");
        linked.put("userName", "password");
        linked.put(null, "nothing");
        System.out.println(linked);

        //Random order, null throws exception
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("class", "Java");
        treeMap.put("hello", "world");
        treeMap.put("James", "Bond");
        treeMap.put("Aysun", "UI testing");
        treeMap.put("soft skills", "Nadir");
        treeMap.put("userName", "password");
//        treeMap.put(null, "nothing"); Throws exception.
        System.out.println(treeMap);


        // The order is not guaranteed, synchronized (Thread safe)
        Map<String, String> hashTable = new Hashtable<>();
        hashTable.put("class", "Java");
        hashTable.put("hello", "world");
        hashTable.put("James", "Bond");
        hashTable.put("Aysun", "UI testing");
        hashTable.put("soft skills", "Nadir");
        hashTable.put("userName", "password");
//      hashTable.put(null, "nothing");Throws exception.
        System.out.println(hashTable);

    }
}
/*
     Insertion Order: the order the elements are added to the collection

     Natural order: entries are added and sorted based on the keys
         - ascii, small --> large
      TreeMap:
      */