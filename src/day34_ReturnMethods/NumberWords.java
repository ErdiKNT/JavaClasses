package day34_ReturnMethods;

import java.util.Scanner;

public class NumberWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        System.out.println(numberAsWord(scan.nextInt()));
    }


    public static String numberAsWord(int num) { // input data type does not have to be same with return data type

        if(num < 1 || num >10){   // if methodu sonra gelemez. Cunku bir kere return kismi okundugunda method biter. Bu yuzden sarti uste yazdik.
            return num + " is an invalid number";
        }

        String[] words = {"One", " Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "nine", "Ten"};
        return words[num-1]; // This will return me numbers as a word, and it is up to input number. -1 will convert the number to an index.





    } // Ben bu kodu buraya yazana kadar main method icinede yazabilirdim. Fakat baska yerde isime yarasa bu kodu cagiramam. Ama method olarak yazarsam
      // baska yerde de cagirabilirim hatta farkli bir projede ve farkli bir packageda bile cagirabilirim.

}
