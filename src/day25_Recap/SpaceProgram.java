package day25_Recap;

import java.util.Scanner;

public class SpaceProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter words");
        String str = scan.nextLine().trim();
        String str1 = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ' ') {
                str1 += "_ ";
            } else {
                str1 += " " + str.charAt(i);
            }
        }

        System.out.println(str1.trim()); // Trim is for removing spaces at the beginning and end.


    }
}
/*
    Space program [String, Loops]

    Given a String return a version of with spaces between all the letters.
    If there is already a space in the String put an underscore

        Ex: java    -> j a v a
            space     -> s p a c e
            more words -> m o r e _ w o r d s

     */