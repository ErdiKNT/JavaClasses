package IQ;

import java.util.Arrays;
import java.util.Random;

public class UniqueIntegersToSumUpZero {
    public static void main(String[] args) {

        Random number = new Random();
        int integer = 4;
        int[] nums = new int[integer];

        int max = 3;
        int min = -3;
        String unique = "";
        String str = "";
        int sum = 0;

        for (int i = 0; sum==0; i++) {
            int num = number.nextInt(max - min) + min;
            str= ""+num;


            if (!(unique.contains(str))) {
                nums[i] += num;
            }
            unique+=num;

            sum+=num;
            if(sum == 0){
                System.out.println(Arrays.toString(nums));
            }
        }




        System.out.println(Arrays.toString(nums));













    }


}
/*



given an integer N --> 1<N<100
return array with unique numbers
 [1, 0, -3, 2] ---> This is true
 [1, -1, 2, -2] ---> This is false because 1 is repeated itself.

public class Scratch {
    public static void main(String[] args) {

        Random number = new Random();
        int integer = 4;
        int[] nums = new int[integer];
        String unique = "";
        int count2 =0;
        int count = 0;
        String str = "";
        while (count2 < integer) {
            int num = number.nextInt(100);
            str= ""+num;

            if (unique.contains(str)) {
                continue;
            }
            unique+=num;
            nums[count] += num;
            count++;
            count2++;


        }
        System.out.println(Arrays.toString(nums));


    }


}


 */