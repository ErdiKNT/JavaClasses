package day32_MultidimensionalArrays;

import java.util.Arrays;

public class AverageOfEach {
    public static void main(String[] args) {
        int[][] nums = {
                {3, 4, 5, 6}, // 0
                {5, 2, 6},    // 1
                {10, 20, 30}  // 2
        };
        double total = 0;
        int totalLength = 0;

        int average = 0;
        for (int[] num : nums) {
            average = 0;
            for (int sum : num) {
                average += sum;

            }
            System.out.println(Arrays.toString(num) + "the average is: " + average / num.length);
            total += average;
            totalLength += num.length;
        }

        System.out.println("Average of the whole 2d array: " + (total/totalLength));


    }
}

/*
Given a 2d array find the average of each inner array
and extra: average of the whole array

 Ex:
   3, 4, 5, 6
   5, 2, 6
   10, 20, 30

 */