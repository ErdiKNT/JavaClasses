package day24_Loops;

import java.util.Scanner;

public class Trial {
    public static void main(String[] args) {
        String str = " hi java low hihi work hard hi code java hi";

        int count = 0;

        for (int i = 0; i < str.length()-1; i++) {
            String str1 = str.substring(i,i+2);
            if(str1.equals("hi")){
                count++;
            }
        }
        System.out.println(count);
    }
}
/*

 Ex:
  Input:
    abc hi how

  Output:
    1

 */