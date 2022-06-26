package day40_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class StringNumbersToSum {
    public static void main(String[] args) {
        ArrayList<String> num1 = new ArrayList<>(Arrays.asList("1235", "349", "5130"));
        System.out.println(sum(num1));

    }


    public static ArrayList<Integer> sum(ArrayList<String> nums) {
        ArrayList<Integer> sums = new ArrayList<>();
        String str = "";
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            str = "";
            sum = 0;
            str = nums.get(i);
            for (int j = 0; j < str.length(); j++) {
                sum += Integer.parseInt(str.charAt(j) + "");
            }
            sums.add(sum);

        }
        return sums;
    }


}
/*
Create a method that will accept an ArrayList of numbers in String
format, add each digit of each element and store into a different
ArrayList. Return the ArrayList of summed numbers

Ex:
Input:
“123”, “34”, “513”
Output:
[ 6, 7, 9 ]
 */