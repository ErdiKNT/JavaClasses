package day41_ArrayListPractice;

import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class SwitchPairs {
    public static void main(String[] args) {
        ArrayList<String> pairs = new ArrayList<>(Arrays.asList("Cat", "in", "the", "hat"));

        for (int i = 0; i < pairs.size(); i+=2) {
            String temp = pairs.get(i); // "Cat"
            pairs.set(i, pairs.get(i+1)); // storing "in" to position i, 0
            pairs.set(i +1, temp);

        }
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