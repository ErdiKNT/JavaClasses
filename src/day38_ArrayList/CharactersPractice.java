package day38_ArrayList;

import java.util.ArrayList;

public class CharactersPractice {
    public static void main(String[] args) {
        ArrayList<Character> ch = new ArrayList<>();

        for (char i = 'A'; i <= 'Z'; i++ ) {
              ch.add(i);
        }

        System.out.println(ch);

        System.out.println("-------------------------------------------");

        ArrayList<Character> ch1 = new ArrayList<>();

        for (char i = 'a'; i<='z'  ; i++) {
             ch1.add(i);
        }
        System.out.println(ch1);

        ch1.remove('a');
        ch1.remove('e');
        ch1.remove('i');
        ch1.remove('o');
        ch1.remove('u');
        System.out.println(ch1);



    }
}
/*
Create an ArrayList of Characters
Fill the ArrayList with letters from A-Z
Print the ArrayList of all the characters
-----------------------------------------
reate an ArrayList of Characters
Fill the ArrayList with letters from a-z
Print the ArrayList of all the characters
Manually remove each vowels and print the new ArrayList
 */