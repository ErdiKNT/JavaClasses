package day32_MultidimensionalArrays;

import java.util.Arrays;

public class AverageOfEachTraditional {
    public static void main(String[] args) {
        int[][] nums = {
                {3, 4, 5, 6}, // 0
                {5, 2, 6},    // 1
                {10, 20, 30}  // 2
        };
        double total = 0;
        int totalLength = 0;

        int average = 0;
        for (int i = 0; i < nums.length; i++) { // Going through the 2d array
            average = 0;
            for (int j = 0; j < nums[i].length; j++) {
                average += nums[i][j];

            }
            System.out.println(Arrays.toString(nums[i]) + "the average is: " + average / nums[i].length);
            total += average;
            totalLength += nums[i].length;
        }

        System.out.println("Average of the whole 2d array: " + (total/totalLength));





    }
}
