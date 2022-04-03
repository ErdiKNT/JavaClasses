package day39_ArrayList;


import java.util.ArrayList;
import java.util.Arrays;

public class TargetArray {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "html","css","java", "javascript","selenium","Java"));

        String target = "java";
        int count = 0;

        for(String s1 : words){
            if(s1.equalsIgnoreCase(target)){
                count++;
            }
        }
        System.out.println(count);



    }
}
/*

Given an ArrayList of Strings and a target word (String) print how many times the target word is in the ArrayList.
Ex:
      Input:
        ”java”, ”html”, “css”, “java”, “javascript”, “selenium”
      Target: java
         Output:
            2
 */