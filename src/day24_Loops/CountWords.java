package day24_Loops;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER YOUR SENTENCE");
        String str = scan.nextLine();
        int spaces = 0;


        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' '){ // str.substring(i, i+1).equals(" ")
                spaces++;
            }
        }
        System.out.println("Spaces: "+spaces);
        System.out.println("Number of words: " + (spaces+1));




    }
}
/*
Input
This has multiple words
output 4
 */