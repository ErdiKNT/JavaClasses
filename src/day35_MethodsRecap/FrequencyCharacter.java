package day35_MethodsRecap;

public class FrequencyCharacter {
    public static int frequencyOfCharacter(String str, char letter) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == letter) {
                count++;
            }


        }
            return count;

    }

}/*

        Ex:
        Input:
        apple, p
        Output:
        2
  */