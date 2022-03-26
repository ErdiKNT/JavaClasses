package day24_Loops;

public class CharactersInString {
    public static void main(String[] args) {
        String s = "java";
        for (int i = 0; i < s.length(); i++) {
            System.out.print((int)s.charAt(i) + " "); // it shows the number of chars
        }
    }
}
