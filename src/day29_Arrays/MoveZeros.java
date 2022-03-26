package day29_Arrays;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {

        int[] nums = {10, 0, 5, 0, 1, 0};
        int[] fixed = new int[nums.length]; //[0, 0, 0, 0, 0, 0]
        int index =0; // Variable to keep track of indexes of the fixed array
        for (int i = 0; i < nums.length; i++) {
             if(nums[i] != 0){
                 fixed[index++] = nums[i];
             }
        }
        System.out.println(Arrays.toString(fixed));
        /*
         for(int each : nums){
            if(each != 0){
                fixed[index] = each;
                index++;
            }
        }
         */



    }
}
/*
input:
   [10,0,5,0,1,0] // Buradaki sifirlar bir sonraki array dizisine koyulmuyor. Zaten yeni actigimiz arrayde default olarak sifirlar var.
output:
   [10,5,1,0,0,0]

 */