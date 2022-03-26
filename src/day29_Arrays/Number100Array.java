package day29_Arrays;

import java.util.Arrays;

public class Number100Array {
    public static void main(String[] args) {
        int[] nums = new int[101];

        for (int i = 0; i < nums.length; i++) {
             nums[i] += i;
        }
        System.out.println(Arrays.toString(nums));
    }
}
/*
Create an int array called numbers that have length of 100
assign 1-100 and print numbers
 */