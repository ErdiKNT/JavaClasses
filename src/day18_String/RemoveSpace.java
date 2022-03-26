package day18_String;

public class RemoveSpace {
    public static void main(String[] args) {
        String str1 = "      Saturday";
        System.out.println(str1);          // "     Saturday"
        System.out.println(str1.length()); // 14 characters with spaces

        str1 = str1.trim();
        System.out.println(str1);          // "Saturday"
        System.out.println(str1.length()); //  8 Characters
    }
}
