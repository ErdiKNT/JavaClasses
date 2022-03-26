package day32_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many chapters are there");
        String [][] book = new String[scan.nextInt()][];
        System.out.println(Arrays.deepToString(book));
        scan.nextLine();

        for (int i = 0; i < book.length; i++) {
            System.out.println("Enter chapter " + (i +1));
            String chapter = scan.nextLine();
            String[] sentences = chapter.split("\\.");  //Breaking up by the dot
            book[i] = sentences;
        }

        System.out.println(Arrays.deepToString(book));



    }
}
/*
Flow:
    How many chapters are there
    make a book with that many chapter
    write the chapters one at a time
    break up each chapter by sentences
 */