package day19_String;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = scan.nextLine();


        System.out.println("First char: " + str.charAt(0));
        System.out.println("Last char: " + str.charAt(str.length()-1));
    }
}
