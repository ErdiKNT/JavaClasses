package day23_Loops;

public class PrintEachCHar {
    public static void main(String[] args) {
        String s = "java";
        // This is a hardcore and time-consuming.
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));

        System.out.println("With Loop");

        // This is more efficient
        for (int i = 0; i < s.length(); i++) {
             char ch = s.charAt(i);
            System.out.println(ch);
        }

    }
}
