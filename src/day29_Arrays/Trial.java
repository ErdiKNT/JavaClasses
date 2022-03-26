package day29_Arrays;

import java.util.Scanner;
import java.util.Arrays;
public class Trial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int max = 0;
        for (int i = 0; i < nums.length; i++) {
               if(max<nums[i]){
                   max=nums[i];
               }
        }
        System.out.println(max);
    }
}
/*
Input:
  [2, 4, 2, 3, -2]

Output:
  4
 */