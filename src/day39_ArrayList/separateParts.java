package day39_ArrayList;

import java.util.ArrayList;

public class separateParts {
    public static void main(String[] args) {
              String sentence = "ABCD123$%#@&456EFG!";
        ArrayList<Character> characters = new ArrayList<>();
        ArrayList<Character> numbers = new ArrayList<>();
        ArrayList<Character> alphabets = new ArrayList<>();

        for (int i = 0; i < sentence.length(); i++) {
               Character ch = sentence.charAt(i);
               if(Character.isAlphabetic(ch)){
                    alphabets.add(ch);
               }else if(Character.isDigit(ch)){
                   numbers.add(ch);
               }else{
                   characters.add(ch);
               }
        }
        System.out.println(alphabets);
        System.out.println(numbers);
        System.out.println(characters);




    }
}
/*
Write a program that can extract the special characters, digits and letters
from a string and stores them into separate ArrayLists of Characters

Ex:
str = "ABCD123$%#@&456EFG!"
list1: {$, %, #, @, &, !}
list2: {A, B, C, D, E, F, G}
list3: {1, 2, 3, 4, 5, 6}
 */