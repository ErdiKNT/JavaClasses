package day31_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ShortestWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] str1 = str.split(", ");
        String smallest = "";

        int index = 10;

        for (int i = 0; i < str1.length; i++) {
            if (str1[i].length() < index) {
                index = str1[i].length();
            }
        }

        for (int i = 0; i < str1.length; i++) {
            if (str1[i].length() == index) {
                smallest += str1[i] + ",";
            }
        }

        String[] small1 = smallest.split(",");
        System.out.println(Arrays.toString(small1));

        System.out.println("Minimum character number is: " + index);


    }
}
/*
Input:
  olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
     5     4      7      3      7       6      4      6      3    3
Output:
  [old, cat, ray]

  volt, olive, fish, hot pursuit, warning, python, java, coffee, part
 */