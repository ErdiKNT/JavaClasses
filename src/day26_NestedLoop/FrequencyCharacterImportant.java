package day26_NestedLoop;

public class FrequencyCharacterImportant {
    public static void main(String[] args) {
        String word = "apple";
        String checked = "";
        for (int i = 0; i < word.length(); i++) {
            int count = 0; //everytime the outer loop iterates, the counter is set back to 0. It is reset between every character.
            char letter = word.charAt(i);
            if (checked.contains("" + letter)) {
                continue;
            }

            for (int j = 0; j < word.length(); j++) {
                char eachLetter = word.charAt(j);
                if (letter == eachLetter) { // word.charAt(i) == word.charAt(j)
                    count++;
                }
            } // End of the inner loop

            System.out.println(letter + " - " + count);
            checked+= letter;
        }
    }
}
/*

String apple

how many times each letter is in the string

a - 1
p - 2
p - 2
l - 1
e - 1

apple
a == a
a == p
a == p
a == l
a == e
 //if you do not use continue, then make condition false, and put second for inside the if.
String word = "apple";
        String checked = "";
        for (int i = 0; i < word.length(); i++) {
            int count = 0; //everytime the outer loop iterates, the counter is set back to 0. It is reset between every character.
            char letter = word.charAt(i);
               if (!(checked.contains("" + letter))) {



                    for (int j = 0; j < word.length(); j++) {

                         char eachLetter = word.charAt(j);

                         if (letter == eachLetter) { // word.charAt(i) == word.charAt(j)
                                count++;
                }
            } // End of the inner loop

            System.out.println(letter + " - " + count);
            checked+= letter;
        }
        }
 */
