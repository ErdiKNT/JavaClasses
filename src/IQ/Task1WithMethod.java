package IQ;

public class Task1WithMethod {

    public static void main(String[] args) {
        String origin = "plusMinusPlusMinusMinUsPlUs";
        System.out.println(plusMinus(origin));
    }


    public static String plusMinus(String word) {
        StringBuilder s = new StringBuilder();
        StringBuilder s1 = new StringBuilder();
        int one = word.length();
        for (int i = 0; i < one; i++) {
            if (s.toString().equalsIgnoreCase("plus") || s.toString().equalsIgnoreCase("minus")) {
                s = new StringBuilder();
            }
            s.append(word.charAt(i));
            if (s.toString().equalsIgnoreCase("plus")) {
                s1.append("+");
            }
            if (s.toString().equalsIgnoreCase("minus")) {
                s1.append("-");
            }
        }
        return s1.toString();

    }

}
/*
String s = {plusminusminusplusplusplusminus}

out:
   {+--+++-}
   ----------------------------------------------------------------------------------------

     public static void main(String[] args) {
            String origin = "plusMinusPlusMinusMinUsPlUs";
        System.out.println(plusMinus(origin));
    }


    public static String plusMinus(String word) {
        String s = "";
        String s1 = "";
        int one = word.length();
        for (int i = 0; i < one; i++) {
            if(s.equalsIgnoreCase("plus") || s.equalsIgnoreCase("minus")){
                s = "";
            }
            s += word.charAt(i);
            if (s.equalsIgnoreCase("plus")) {
                s1 += "+";
            }
            if (s.equalsIgnoreCase("minus")) {
                s1 += "-";
            }
        }
        return s1;

    }
 */