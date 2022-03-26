package day06_arithmetic_operators;

public class TypeCasting {
    public static void main(String[] args) {
        short numberOne = 40;
        float numTwo = numberOne; //No casting is needed because from smaller to larger.
        System.out.println(numberOne); //40
        System.out.println(numTwo);    //40.0
        System.out.println("------------------------------------------");

        float num3 = 100.5F;
        short num4 = (short) num3;
        System.out.println("num3 = " + num3); //100.5
        System.out.println("num4 = " + num4); //100
        System.out.println("-----------------------------------------");

        double num5 = 10.2;
        int num6 = (int)num5;
        System.out.println(num5); //10.2
        System.out.println(num6); //10
        System.out.println("----------------------------------------");

        float num7 = 30; //30 is int by default, at it automatically goes up to float.
        byte num8 = (byte)num7;
        System.out.println(num8);//30
        System.out.println(num7);//30.0
        System.out.println("-----------------------------------------");

        char ch = 'A';
        int ch1 = ch;
        System.out.println(ch1); //65 We do not need to type casting. These are primitive types we can turn them into each other in this way.
        System.out.println((int)ch); // 65.We are directly casting here.
        System.out.println((char)66);//B
        System.out.println((int)'$'); //36
        System.out.println((char)36); //$





















    }
}
