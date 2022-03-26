package day30_Arrays;

import java.util.Scanner;

public class NonDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        int count = 0;
        for (int i = 0; i < nums.length; i++) {

            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;

                }
            }
            if (count == 1) {
                System.out.println("Non-Duplicate number is: "+nums[i]);
            }
        }
    }
}
/*
[1, 2, 3, 4, 3, 2, 1]
 output
   2
 */