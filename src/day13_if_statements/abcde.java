package day13_if_statements;

import java.util.Arrays;

public class abcde {
    public static void main(String[] args) {
        int[]nums={10,0,5,0,1,0};
        int temporary;

        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if(nums[i]<nums[j]){
                    temporary=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temporary;
                }

            }

        }

        System.out.println(Arrays.toString(nums));
    }
}
