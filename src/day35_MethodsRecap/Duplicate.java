package day35_MethodsRecap;

import my_utilities.StringUtil;

public class Duplicate {
    public static String DuplicateChar(String word) {
        String duplicate = "";
        String checked = "";
        for (int i = 0; i < word.length(); i++) {
            if (checked.contains("" + word.charAt(i))) {
                continue;
            }

            int count = StringUtil.frequencyOfCharacter(word, word.charAt(i));
            checked += word.charAt(i);
            if (count > 1) {
                duplicate += word.charAt(i);
            }

        }

        return duplicate;
          /*
     Burada farkli bir yaklasim kullandik. Nested loop yapmamiza gerek yok. Daha onceden StringUtilde, frequency methodunu olusturmustuk. O methodu kullanarak
     unique characteri elde ettik.
           */

    }
}
