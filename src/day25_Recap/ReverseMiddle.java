package day25_Recap;

import java.util.Scanner;

public class ReverseMiddle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 words");
        String str = scan.nextLine();

        int firstSpace = str.indexOf(" ");
        int secondSpace = str.lastIndexOf(" "); // str.indexOf(" ", firstSpace + 1);

        String middle = str.substring(firstSpace+1, secondSpace);
        String reverse = "";

        for (int i = middle.length()-1; i >=0 ; i--) {
            reverse+=middle.charAt(i);
        }

        System.out.println(str.replace(middle,reverse));






    }
}
/*
I love java
I evol java
 */