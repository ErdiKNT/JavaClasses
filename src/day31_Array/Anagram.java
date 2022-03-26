package day31_Array;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str = "listen";
        String str1 = "silent";

        char[] ch = str.toCharArray(); // 'l', 'i', 's', 't', 'e', 'n'
        char[] ch1 = str1.toCharArray();//  's', 'i', 'l', 'e', 'n', 't'

        Arrays.sort(ch);
        Arrays.sort(ch1);

        System.out.println(Arrays.toString(ch));
        System.out.println(Arrays.toString(ch1));

        if (Arrays.equals(ch, ch1)) {
            System.out.println("It is anagram");
        } else {
            System.out.println("It is not an anagram");
        }


    }
}
/*
Given two strings
find if they are anagram or not
the characters are the same in both strings, but the order is different

 listen
 silent
 */