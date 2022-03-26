package day23_Loops;

import java.util.Scanner;

public class CountLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String str = scan.nextLine().toLowerCase();
        System.out.println("Which char do you want to count?");
        char ch = scan.next().charAt(0);
        int x = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ch) {
                x++;
            }

        }

        System.out.println(x);


    }
}
/*
Given a string, and we want to count how many 'a' we have in the string.
Challenge: Adjust so that we can check for not only 'a' but any character
EX: aabbcaa
  a : 4
*/