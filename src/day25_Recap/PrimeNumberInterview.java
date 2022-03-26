package day25_Recap;

import java.util.Scanner;

public class PrimeNumberInterview {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        int primeNumber = scan.nextInt();


        boolean isPrime = primeNumber>=2;

        for (int i = 2; i < primeNumber; i++) {
            if (primeNumber % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(primeNumber + " is prime");
        } else {
            System.out.println(primeNumber + " is not prime");
        }


    }
}
