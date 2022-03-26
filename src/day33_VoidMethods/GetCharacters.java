package day33_VoidMethods;

/*
make a method that prints all the letters from A - Z

make a method that prints all the letters from a - z

make a method that prints all the letters from Z - A

make a method that prints all the letters from z - a

make a method that prints all the numbers from 0 - 9
 */
public class GetCharacters {
    public static void letterUpperCase() { //STATIC --> ALLOWS US TO CALL THE METHOD BY THE CLASS NAME
        for (char i = 'A'; i <= 'Z'; i++) {// className.method()
            System.out.print(i + " ");

        }
        System.out.println();
    }

    public static void letterSmallerCase() {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i+" ");

        }
        System.out.println();
    }

    public static void reverseUpper() {
        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + " ");

        }
        System.out.println();
    }

    public static void reverseLower() {
        for (char i = 'z'; i >= 'a'; i--) {
            System.out.print(i + " ");

        }
        System.out.println();
    }

    public static void numbers() {
        for (int i = 0; i <= 9; i++) {
            System.out.print(i + " ");

        }

    }


}
