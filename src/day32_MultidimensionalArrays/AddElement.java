package day32_MultidimensionalArrays;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {
        int[] nums = {45, 123, 62};

        int[] newNums = Arrays.copyOf(nums, nums.length + 1);// I copied first array into the new one but, last index is empty.
        //                            copy     size of the new array
        newNums[newNums.length - 1] = 100;  // I put the new number for the last index
        System.out.println(Arrays.toString(newNums));

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