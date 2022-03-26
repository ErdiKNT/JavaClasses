package my_utilities;

public class StringUtil {
    /*
    Reverse word
     */
    public static String reverse(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return reversed;

    }

    /*
Fix format
Ex:
 Input :
   jamES  Make first letter upperCase, rest of them will be lowerCase
 output :
   James
 */
    public static String fix(String word) {
        word = word.trim();
        String fixed = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
        return fixed;

    }
/*
    Ex:
    Input:
          apple, p
    Output:
            2
  */

    public static int frequencyOfCharacter(String str, char letter) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == letter) {
                count++;
            }


        }
        return count;

    }

    /*
    [UniqueCharacters]
    Ex:
    Input:
         aaaaabcccdeeff
    Output:
         bd
     */
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
/*
[Duplicate]
  "aaaaabbbbbcdeeeee"

  a, b, e
 */
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

    }


}
