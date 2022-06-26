package IQ;

public class DivideWithoutOperator {


    public static void main(String[] args) {

        System.out.println(divide(36.6, 7.6));
    }


    public static double divide(double x, double y) {

        int count = 0;

        while (x >= y) {
            x -= y;
            count++;

        }

        return count;

    }


}
/*
2) Numbers - Divide without / operator
Write a method that can divide two numbers without using division operator
 */