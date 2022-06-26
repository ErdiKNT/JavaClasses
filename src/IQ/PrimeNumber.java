package IQ;

public class PrimeNumber {

    public static void main(String[] args) {

        Prime(10);
    }




    public static void Prime(int primeNumber){
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
