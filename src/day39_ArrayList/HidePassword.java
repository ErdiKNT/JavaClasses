package day39_ArrayList;


import java.util.ArrayList;
import java.util.Arrays;

public class HidePassword {
    public static void main(String[] args) {
        ArrayList<String> passwords = new ArrayList<>(Arrays.asList("one","hi","hold"));
        String hide = "";
        ArrayList<String> changed = new ArrayList<>();
        for (int i = 0; i < passwords.size(); i++) {
             hide="";
            for (int j = 0; j < passwords.get(i).length(); j++) {
                 hide += "*";
            }
            changed.add(hide);
        }
        System.out.println(changed);

    }
}
/*
Given an ArrayList of passwords (String). Hide each password in a star
(*) format where each character is a star and print the ArrayList of
hidden passwords

Ex:
Input:
         {"one", "hi", "hold}
Output:
         [ ***, **, **** ]
 */