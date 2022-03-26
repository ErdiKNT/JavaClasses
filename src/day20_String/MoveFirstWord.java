package day20_String;

import java.util.Scanner;

public class MoveFirstWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String str = scan.nextLine().trim();

        int spaceIndex = str.indexOf(" "); // This line is to obtain the index number of first space.
        String firstWord = str.substring(0,spaceIndex); // This line will copy, until the first space.
        String sentence = str.substring(spaceIndex);   // This line will copy everything, after first space.
        System.out.println(sentence.trim() + " " +firstWord);

    }
}
/*
    [Move first word]
        Given a sentence. Display the sentence with the first word moved to the end of the sentence.
        Ex:
        Input: Java is a fun language
        Output: is a fun language Java
        Hint: Use indexOf and substring
     */