package day31_Array;

public class AnagramAnotherMethod {
    public static void main(String[] args) {
        String str = "below";
        String str1 = "elbow";

        char[] ch = str.toCharArray();  // 'l', 'i', 's', 't', 'e', 'n'
        char[] ch1 = str1.toCharArray();//  's', 'i', 'l', 'e', 'n', 't'
        int count = 0;
        boolean isAnagram = true;

        for (int i = 0; i < ch.length; i++) {
            count = 0;
            if (str.length() != str1.length()) {
                isAnagram = false;
                System.out.println("It is not Anagram");
                break;
            }

            for (int j = 0; j < ch1.length; j++) {

                if (ch[i] == ch1[j]) {
                    count++;
                    if (count > 1) {
                        isAnagram = false;
                    }
                }

            }
            if (!isAnagram) {
                System.out.println("It is not Anagram");
                break;
            }

        }
        if (isAnagram) {
            System.out.println("It is Anagram");
        }


    }
}
