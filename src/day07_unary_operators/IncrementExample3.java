package day07_unary_operators;

public class IncrementExample3 {
    public static void main(String[] args) {
        int i = 5;
        int z = i++;

        System.out.println(i);//6
        System.out.println(z);//5


        int a = 10;
        int b = a+1;

        System.out.println(a);//10
        System.out.println(b);//11

        int c = ++a;         //a - 10 --> 10 + 1 = 11
        System.out.println(c);//11
        System.out.println(a);//11


    }
}
