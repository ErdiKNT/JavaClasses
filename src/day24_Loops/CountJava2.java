package day24_Loops;

public class CountJava2 {
    public static void main(String[] args) {
        String str = "Java is a java language.java";
        int count = 0;

        while (str.contains("java")) {
            str = str.replaceFirst("java", "*").toLowerCase();
            count++;
            System.out.println(str);
        }

        System.out.println(count);
        System.out.println(str);
    }
}
