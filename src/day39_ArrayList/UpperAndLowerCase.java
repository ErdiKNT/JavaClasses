package day39_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;

public class UpperAndLowerCase {
    public static void main(String[] args) {
        String sentence = "heLLoWoRLD";
        ArrayList<Character> upper = new ArrayList<>();
        ArrayList<Character> lower = new ArrayList<>();

        for (int i = 0; i < sentence.length(); i++) {
              Character ch = sentence.charAt(i);
               if(Character.isUpperCase(ch)){
                   upper.add(ch);
               }else {
                   lower.add(ch);
               }
        }
        System.out.println(upper);
        System.out.println(lower);




    }
}
/*
Write a program that can extract the uppercase and lowercase
characters from a String and store them into separate ArrayLists of
Characters

Ex:
str = "heLLoWoRlD"
list1: {h, e, o, o, l}
list2: {L, L, W, R, D}
 */