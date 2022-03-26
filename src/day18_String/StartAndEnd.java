package day18_String;

public class StartAndEnd {
    public static void main(String[] args) {
        String str = "App";
        System.out.println(str.startsWith("A"));  // True.
        System.out.println(str.startsWith("Ap")); // True.Not only one character, it checks whole things.

        System.out.println(str.endsWith("pp"));   // True.

        System.out.println("--------------------------------------------------------------------------");
        String str1 = "Apples";
        System.out.println(str1.startsWith("App"));
        System.out.println(str1.startsWith("app"));

        System.out.println(str1.startsWith("Apples"));

        String str2 = "App";
        System.out.println(str.startsWith(str2)); // does the String str start with the String s.

        System.out.println(str.startsWith(" App")); // space is in the String, so it counts as a space character
        System.out.println(str.startsWith(   "App")); // spaces are in the code, doesn't affect the String

        System.out.println(str.startsWith("Aoo"));

        String sentence = "today was a good day";
        System.out.println(sentence.startsWith("today was a"));

        System.out.println(sentence.endsWith("day")); // true
        System.out.println(sentence.endsWith(" day")); // true
        System.out.println(sentence.endsWith("good")); // false
        System.out.println(sentence.endsWith("today was a good day"));


    }
}
