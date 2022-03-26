package day25_Recap;

import java.util.Locale;

public class trial {
    public static void main(String[] args) {
        String sentence = "Java is a general-purpose computer-programming language that is concurrent, class-based,\n" +
                "    object-oriented,[15] and specifically designed to have as few implementation dependencies as possible.";
        int countJava = 0;
        int countPython = 0;
        String result = "";
        String result1 = "";

        for (int i = 0; i < sentence.length()-4; i++) {

            result = sentence.substring(i, i + 4).toLowerCase(Locale.ROOT);
            if (result.contains("java")) {
                countJava++;
            }

        }
        for (int i = 0; i < sentence.length()-6; i++) {
            result1 = sentence.substring(i, i + 6).toLowerCase();
            if (result1.contains("python")) {
                countPython++;
            }
        }

        if (countJava == countPython) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


    }
}
/*
Use a loop to count how many times the characters java and python are found in the given String sentence.
Output true if java and python appear the same number of times, otherwise output false.
Ex:
  Input:
    We study java not python

  Output:
    true

Ex:
  Input:
    What's the difference between java, javascript and python?

  Output:
    false

  -> the 'java' characters appear 2 times in the String but the 'python' characters appear only 1 time.

  Ex:
  Input:
   Java is a general-purpose computer-programming language that is concurrent, class-based,
    object-oriented,[15] and specifically designed to have as few implementation dependencies as possible.

  Output:
    true

  -> The first word 'Java' is not counted because it starts with the uppercase 'J',
  so the number of times 'java' and 'python' appear in this String is 0 and 0 and since they are the same, the output is true
 */