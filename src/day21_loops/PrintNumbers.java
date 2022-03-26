package day21_loops;

public class PrintNumbers {
    public static void main(String[] args) {
        // Even numbers
        int number = 0;

        while (number <= 100) {
            number++;
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
        // Odd numbers
        int num = 0;
        while (num <= 100) {
            num++;
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        // Odd numbers 2nd Approach
        int num1 = 0;
        while (num1<20){
            num1+=2; // num1 = num1 + 2
            System.out.print("\n"+num1+" ");
        }


    }
}
/*
Print all the even numbers from 1 to 100, on separate lines

print all the odd numbers from 1 to 100, but all in one line with spaces between each number
 */