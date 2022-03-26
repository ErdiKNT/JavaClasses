package day32_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter a number");
            nums[i] = scan.nextInt();
        }

        System.out.println("Array so far: "+Arrays.toString(nums));
        int[] expanded = Arrays.copyOf(nums,nums.length+1); // We expanded the size of the new array by 1.

        System.out.println("Enter the last number");
        expanded[expanded.length-1] = scan.nextInt();// We are going to add last number in thi step

        System.out.println(Arrays.toString(expanded));



    }
}

/*
Have a starting array
you want to add a number to the end
so make your array bigger to store the new number
   Ex:
     {45, 123, 62}
     adding 100
     {45, 124, 62, 100}
 */
