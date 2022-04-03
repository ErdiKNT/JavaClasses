package day39_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateArrayList {
    public static void main(String[] args) {
        ArrayList<String> listOne = new ArrayList<>();
        listOne.add("hello");
        listOne.add("bye");
        System.out.println(listOne); // [hello, bye]

        ArrayList<String> listTwo = new ArrayList<>(listOne); // We copied listOne into listTwo.

        System.out.println(listTwo); // [hello, bye]

        listTwo.add("Hola");
        System.out.println(listTwo); //  [hello, bye, Hola]
        listTwo.add(2, "Erdi");
        System.out.println(listTwo); // [hello, bye, Erdi, Hola]

        ArrayList<String> listThree = new ArrayList<>(Arrays.asList("one", "two", "Three"));
        System.out.println(listThree);

        // ArrayList listFour = new ArrayList<>("four", "five","six"); Not valid


    }
}
