package day21_loops;

public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        int num1 = 1;
        while(num>0){

            num1*=num;
            num--;

        }
        System.out.println(num1);
    }
}
