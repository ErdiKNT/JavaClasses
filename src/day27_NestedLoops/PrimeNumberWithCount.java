package day27_NestedLoops;

public class PrimeNumberWithCount {
    public static void main(String[] args) {
        int range = 100;
        String result = "";
        for (int i = 2; i <= range; i++) {//The purpose of this loop is to check all the numbers from 2 to the value the range variable

            int count = 0; //Putting the counter inside the outer loop will reset it back to 0 for the next number

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    count++;
                    break;//This increases the performance of the program.

                }

            } // End of inner loop.
            if(count==0){ // if count is less than one that mean number is prime. Number is only divisible by itself.
                result+=" "+i;
            }

        }
        System.out.println(result);
    }
}
/*
 i = 6
 j = 2; j<6; j++
   i % j
   6 % 2 -- > count++
   6 % 3 -- > count++
   6 % 4
   6 % 5
 */