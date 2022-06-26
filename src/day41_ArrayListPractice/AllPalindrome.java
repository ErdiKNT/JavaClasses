package day41_ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class AllPalindrome {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Anna", "Java", "Python","Racecar","Level","Cydeo","Eye"));
        System.out.println(palindrome(words));
    }



    public static ArrayList<String> palindrome (ArrayList<String> word){
        ArrayList<String> palindrome1 = new ArrayList<>();
        String str = "";
        String reverse = "";
        for (int i = 0; i < word.size(); i++) {
             reverse = "";
             str = word.get(i);
            for (int j = str.length()-1; j >=0; j--) {
                  reverse +="" + str.charAt(j);
            }
            if(str.equalsIgnoreCase(reverse)){
                palindrome1.add(reverse);
            }
        }
        return palindrome1;
    }
}
/*
Create a method that will accept an ArrayList of Strings and return an ArrayList of Palindrome Strings
Ignore case sensitivity

Ex:
Input:
    "Anna",  "Java",  "Python", "Racecar", "Level", "Cydeo”, "Eye"
Output:
     Anna, Racecar, Level, Eye
 */