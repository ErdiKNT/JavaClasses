package my_utilities;

public class ArrayUtil {
/*
Max num in an array
 */
    public static int maxNumber(int [] nums){
        int max = nums[0];
        for(int num : nums){
            if(num >max){
                max = num;
            }
        }
        return max;

    }

  /*
  min num in array
   */
  public static int minNumber(int [] nums){
      int min = nums[0];
      for(int num : nums){
          if(num < min){
              min = num;
          }
      }
      return min;

  }
  /*
  Contains
  create a method that will accept an int array and an int number. Check and
  return if the given number is in the array.
  */

    public static boolean Contain(int[] num, int number) {
        boolean check = false;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == number) {
                check = true;
            }
        }
        return check;
    }

}
