package day35_MethodsRecap;

import my_utilities.StringUtil;

public class UniqueCharacters {
    public static String UniqueChar(String word) {
        String unique = "";
        String checked = "";
        for (int i = 0; i < word.length(); i++) {
            if (checked.contains("" + word.charAt(i))) {
                continue;
            }

            int count = StringUtil.frequencyOfCharacter(word, word.charAt(i));
            checked += word.charAt(i);
            if (count == 1) {
                unique += word.charAt(i);
            }

        }

        return unique;
          /*
     Burada farkli bir yaklasim kullandik. Nested loop yapmamiza gerek yok. Daha onceden StringUtilde, frequency methodunu olusturmustuk. O methodu kullanarak
     unique characteri elde ettik.
           */

    }

}
/*
Ex:
Input:
     aaaaabcccdeeff
Output:
     bd
 */