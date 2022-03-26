package day23_Loops;

import java.util.Scanner;

public class PalindromeInterview {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String reversedWord= "";

        for (int i = word.length()-1; i >= 0 ; i--) {
            reversedWord += word.charAt(i);

        }
        if(word.equals(reversedWord)){
            System.out.println("It is palindrome");
        }else{
            System.out.println("It is not palindrome");
        }









    }
}
/*
Palindrome :
   Ex:
      mom
      racecar
      level
      madam
   Task: Check if a word is palindrome.
 */