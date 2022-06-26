package IQ;

public class SwapNumbers {
    public static void main(String[] args) {
        swap(10, 20);
    }


    public static void swap(int x, int y) {

        x = x + y; // 20 + 10 = 30
        y = x - y; // 30 - 20 = 10 ===> Y became 10.
        x = x - y; // 30 - 10 = 20 ===> X became 20.

        System.out.println("x is: " + x);
        System.out.println("y is: " + y);


    }


}
/*
4) Numbers - Swap Numbers
Swap two variable' values without using a third variable
 */