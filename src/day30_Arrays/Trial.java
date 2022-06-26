package day30_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Trial {
    public static void main(String[] args) {

        String str = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";
        String[] arr = str.split(", ");
        String shortests = arr[0];
        String str3 = "";
        for (int i = 0; i < arr.length; i++) {
            if (shortests.length() >= arr[i].length()) {

                shortests = arr[i];
                if (shortests.length() == 3) {
                    str3 += shortests + " ";
                }
            }
        }
         String[] arr2 = str3.split(" ");

        System.out.println(Arrays.toString(arr2));


    }
}
/*
Input:
  olive, fish, pursuit, old, warning, python, java, coffee, cat, ray

Output:
  [old, cat, ray]
 */