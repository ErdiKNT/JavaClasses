package day27_NestedLoops;

import java.util.Scanner;

public class Trial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String str = scan.nextLine();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char inner = str.charAt(j);
                if (letter == inner) {
                    count++;
                }

            }
            if (count == 1) {
                result += letter;
                break;
            } else if (count > 1) {
                result += "-1";
                break;
            }


        }
        System.out.println(result);


    }
}
/*
           Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
           Input: s = "leetcode"
           Output: 0

           Input: s = "loveleetcode"
           Output: 2

           Input: s = "aabb"
           Output: -1
 */