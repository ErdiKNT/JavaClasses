package day39_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourOrLess {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("apples","tree","loop","cat","animal","shortcut"));
        ArrayList<String> word1 = new ArrayList<>();

        for(String s1 : words){
            if(s1.length()<=4){
               word1.add(s1);
            }

        }
        System.out.println(word1);

    }
}
/*
Given an ArrayList of Strings, go through and find Strings that are 4
characters or less. Take those Strings and put them into a different
ArrayList. Print that ArrayList of words

Ex:
Input:
      “apples”, “tree”, “loop, “cat”, “animal”, “shortcut”
Output:
      [ tree, loop, cat ]
 */