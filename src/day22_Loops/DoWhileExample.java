package day22_Loops;

public class DoWhileExample {
    public static void main(String[] args) {
        int a = 0;

        do{
            //Everything in the curly brackets are in the loop.
            System.out.println(a);
            a++;
        }while (a <= 10);

        System.out.println("With false boolean:---------------------------------------");

        int a2 = 0;

        do{
            //Everything in the curly brackets are in the loop.
            System.out.println(a2);
            a2++;
        }while (a2 == 10); // This boolean is false but at least it will run loop one time.

        System.out.println("as while loop---------------------------------------------");

        int a3 = 0;
        while(a3 == 10){  // This boolean is false, but it will not run loop even one time.
            System.out.println(a3);
            a3++;
        }

    }
}
