package day35_MethodsRecap;

public class MinNumberInArray {
      public static int maxNumber(int [] nums){
          int max = nums[0];
          for(int num : nums){
              if(num >max){
                  max = num;
              }
          }
           return max;

      }

}
/*
Find min number in an array
 */