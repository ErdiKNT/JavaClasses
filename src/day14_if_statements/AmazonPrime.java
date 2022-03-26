package day14_if_statements;

public class AmazonPrime {
    public static void main(String[] args) {
        boolean hasPrime = false;
        double price = 30.42;

        if (hasPrime) {
            System.out.println("Eligible for 2 days shipping");


        } else { // We added another if into else block in order to make it nested if.
            if (price >= 25) {
                System.out.println("Eligible for regular free shipping");
            } else {
                System.out.println("Not eligible for free shipping. Shipping fee: 3.99");
            }

        }


    }
}
/*
        Task:
            declare and assign a price variable
            declare and assign a boolean - hasPrime variable

            possible outputs:

                prime member:
                    Eligible for 2 days shipping

                not prime and item price is more than or equal 25:
                    Eligible for regular free shipping

                not prime and item price is less than 25:
                    Not eligible for free shipping. Shipping fee: 3.99

         */
