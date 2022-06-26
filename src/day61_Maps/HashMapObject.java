package day61_Maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapObject {
    public static void main(String[] args) {
        // Keys are Integer, and values are String. No primitive data types, these are objects
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(3, "Three");
        map.put(10, "ten");
        map.put(5, "five");
//      map.put(10, "ten"); Can not be copy keys.
        System.out.println(map);// keys must be unique. can not be copy but  values can be more than one.
//      HashMap element order is random, not insertion order, not sorted.

        System.out.println(map.get(3)); // three. get() method read the key value from map and return it.
        String value = map.get(5);// The value of the key is string type, so we can store it in the String reference.

        map.remove(1); // remove method argument is the key, it removes the whole entry.
        System.out.println(map);

        System.out.println(map.containsKey(1)); // We removed 1, so we do not have it. This method will return false.
        System.out.println(map.containsValue("five"));// This time we checked by the value and yes we have that value, it will return True. Case sensitive!!!

        map.put(null, null);
        System.out.println(map);

        map.put(null, "hello world");// null key exists, so the value gets updates to hello world
        System.out.println(map);

        map.put(3, "March");// 3 key exists, the value gets updated to March
        System.out.println(map);

        map.put(7, "March");

    }
}
