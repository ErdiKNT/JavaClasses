package day39_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class SwitchPairs {
    public static void main(String[] args) {
        ArrayList<String> pairs = new ArrayList<>(Arrays.asList("Cat", "in", "the", "hat"));

        System.out.println("There are two pairs: \n" + "\""+pairs.get(0) +"\""+ " and " +"\"" +pairs.get(1)+"\"\n" + "\""+pairs.get(2)+"\""+ " and " + "\""+ pairs.get(3)+"\"" );
        pairs.set(0, "in");
        pairs.set(1,"cat");
        pairs.set(2, "hat");
        pairs.set(3, "the");
        System.out.println(pairs);


    }
}
/*
Given an ArrayList of words switch position for
each pair in the List. A pair is an element and
the element next to it.

The given ArrayList will always have an even
number of elements so each element will
always have a single pair.

Ex:
Input: {"Cat", "in", "the", "hat"}
There is two pairs:
"Cat" and "in"
"the" and "hat"
Output: {"in", "Cat", "hat",
"the”}
 */