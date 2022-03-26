package day25_Recap;

import java.util.Scanner;

public class MultiplyEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string");
        String word = scan.nextLine();
        System.out.println("Enter the number");
        int number = scan.nextInt();

        String str1 = "";

        for (int i = 0; i < number; i++) {
            str1 += word.charAt(word.length()-1);

        }
        System.out.println(word+str1);


    }
}
/*
Given a String and a number return a String that has the ending character duplicated and attached by the number amount of times

        Ex:
            Input:
                Hello?
                3
            Output:
                Hello????

        Ex:
            Input:
                java
                5
            Output:
                javaaaaaa

 */