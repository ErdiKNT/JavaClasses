package day23_Loops;

public class CountHi {
    public static void main(String[] args) {
        String str = "aaaahiaaahhi";
        int x = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {  // i = 'h' and i+1 = 'i' So we should use i and i+1, it will count two character at a time.
                String str1 = "" + str.charAt(i) + str.charAt(i + 1);
                x++;
                System.out.println(str1);
            }


        }
        System.out.println(x);

    }
}
