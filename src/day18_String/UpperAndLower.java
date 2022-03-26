package day18_String;

public class UpperAndLower {
    public static void main(String[] args) {
        String str = "sNOw";

        System.out.println(str.toUpperCase()); // SNOW

        System.out.println(str.toLowerCase()); // snow

        System.out.println(str);  // sNOw

        String word = "HELLO";
        word = word.toLowerCase();
        System.out.println(word); // hello. After this point we do not have access to first string. It is assigned to new one.

        String word2 = word + "WORLD";
        System.out.println(word2); // helloWORLD

        word += " new text";
        System.out.println(word); //hello new text

        String old = "mark";
        String newValue = old.toUpperCase();
        System.out.println(newValue); //MARK










    }
}
