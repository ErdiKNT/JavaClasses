package day27_NestedLoops;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "AAABCCDEEEF";
        String checked = "";

        for (int i = 0; i < str.length(); i++) {

            if (checked.contains("" + str.charAt(i))) {
                continue;
            }
            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count > 1) {

                System.out.println(str.charAt(i));

            }
            checked += str.charAt(i);
        }
    }
}
/*
String str = "AAABCCDEEEF";
        String checked = "";
        for (int i = 0; i < str.length(); i++) {

            if (checked.contains("" + str.charAt(i))) {
                continue;
            }
            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println(str.charAt(i));
            }
            checked += str.charAt(i);
        }
 */