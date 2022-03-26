package day06_arithmetic_operators;

public class DifferentTypes {
    public static void main(String[] args) {
        //int and int ==> int
        System.out.println(10 - 5);             //5
        System.out.println(10 * 5);             //50

        //double and int ==> double
        System.out.println(10.0 / 5);           //2.0

        //double and double ==> double
        System.out.println(10.0 / 2.0);         //5.0

        //int and double ==> double
        System.out.println(10 / 2.0);           //5.0
        System.out.println((int)(10.0 / 2.0));  //5
        System.out.println((int)10.0 / 2);      //5
        System.out.println((double)10 / 5);     //2.0

        byte b1 = 10;
        byte b2 = 20;

        int sum = b1+b2;
        byte sumByte = (byte)(b1+b2);
        System.out.println("sumByte = " + sumByte);
        System.out.println("sum = " + sum);

       // byte sum = b1 + b2; This will not work, because the values get changed to int during the calculation.








    }
}
