package day24_Loops;

public class BiggestSubstring {
    public static void main(String[] args) {
             String str = "aaabbbcccccddddee";
             String sub = "";
             String biggest = "";

        for (int i = 0; i < str.length()-1; i++) {

            sub+=str.charAt(i);
            if(str.charAt(i) != str.charAt(i+1)){  // This condition checks char and next to it.
                if(sub.length()>biggest.length()){
                     biggest = sub;
                }
                sub = ""; // Resets this string for the next substring.
            }





        }
        System.out.println(biggest);
        // TODO: 3/6/2022 Debugger ile incelemek icin cok uygun bir ornek.
    }
}
/*
Biggest substring of matching characters
Given a String find the biggest substring of chars that match and print
it.
Ex: aaabbbcccccddddee
Output: ccccc
 */