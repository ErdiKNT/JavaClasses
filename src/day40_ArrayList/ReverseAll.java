package day40_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseAll {
    public static void main(String[] args) {
        ArrayList<String> words2 = new ArrayList<>(Arrays.asList("ted", "talk", "learn"));
        System.out.println(reverse(words2));


    }

    public static ArrayList<String> reverse(ArrayList<String> words) {
        ArrayList<String> reverse1 = new ArrayList<>();
        String str = "";
        String reverse = "";
        for (int i = 0; i < words.size(); i++) {
            str = "";
            reverse = "";
            str = words.get(i);

            for (int j = str.length() - 1; j >= 0; j--) {
                reverse += str.charAt(j) + "";
            }
            reverse1.add(reverse);
        }
        return reverse1;
    }

}
/*
Create a method that will take an ArrayList of Strings and
reverse each element and return an ArrayList of all reversed words

Ex:
Input: {"ted", "talk", "learn"}
Output: {"det", "klat", "nrael"}
 */