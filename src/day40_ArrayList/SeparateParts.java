package day40_ArrayList;


import java.util.ArrayList;
import java.util.Arrays;

public class SeparateParts {
    public static void main(String[] args) {
        //MAIN STRING
        String s = "ABCD123$%#@&456EFG!";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(s.split("")));
        System.out.println(list); // [A, B, C, D, 1, 2, 3, $, %, #, @, &, 4, 5, 6, E, F, G, !]

        //RETAIN NUMBERS
        ArrayList<String> numbers = new ArrayList<>(list);
        numbers.retainAll(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));
        System.out.println(numbers); // [1, 2, 3, 4, 5, 6]

        //RETAIN SPECIAL CHARS
        ArrayList<String> specialCharacters = new ArrayList<>(list);
        specialCharacters.retainAll(Arrays.asList("!" , "@", "#", "$", "%", "&", "^"));
        System.out.println(specialCharacters); // [$, %, #, @, &, !]

        //REMOVE ALL
        ArrayList<String> letters = new ArrayList<>(list);
        letters.removeAll(numbers); // We are removing numbers in order to get alphabets only
        letters.removeAll(specialCharacters); // We are removing specialChars in order to get alphabets only
        System.out.println(letters); // [A, B, C, D, E, F, G]



















    }
}


