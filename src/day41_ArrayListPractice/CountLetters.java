package day41_ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class CountLetters {
    public static void main(String[] args) {
          ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "html","css","java","javascript","selenium"));
          System.out.println(CountLetter(words,'j'));
    }

    public static Integer CountLetter(ArrayList<String> words, Character ch) {
        Integer count = 0;
        String str = "";
        for (int i = 0; i < words.size(); i++) {
            str = words.get(i);


            for (int j = 0; j < str.length(); j++) {
                  if(str.charAt(j) == ch){
                      count++;
                  }
            }


        }
       return count;


    }
}
/*
Create a method that will accept an ArrayList of Strings
and a letter (char) print how many times the letter is found in the ArrayList elements

Ex:
Input:
           ”java”, ”html”, “css”, “java”, “javascript”, “selenium”
letter: ‘a’
Output:
            6
 */