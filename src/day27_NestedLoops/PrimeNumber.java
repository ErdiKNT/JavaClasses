package day27_NestedLoops;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 50;
        boolean isPrime = true;
        String result = "";
        for (int i = 2; i <= 50; i++) {
            isPrime = true;
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {

                    isPrime = false;
                    break;
                }


            }
            if (isPrime) {
                result += " " + i;
            }

        }
        System.out.println(result);
    }
}
/*
 input:
     50
 output:
    2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47 //These are the prime numbers up until 50.    
 */