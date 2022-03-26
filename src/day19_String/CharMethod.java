package day19_String;

public class CharMethod {
    public static void main(String[] args) {
        String str = "java";
        //            0123
        System.out.println(str.length()-1);

        System.out.println(str.charAt(0)); // J
        System.out.println(str.charAt(1)); // A
        System.out.println(str.charAt(2)); // V
        System.out.println(str.charAt(3)); // A

        int lastIndex = str.length()-1;

        int secondLast = str.length()-2;

        int thirdLast = str.length()-3;

        int fourthLast = str.length()-4;

        System.out.println(""+str.charAt(fourthLast) + str.charAt(thirdLast) + str.charAt(secondLast) + str.charAt(lastIndex));
        System.out.println(str.charAt(fourthLast) + str.charAt(thirdLast)); // Boyle olursa toplam sayi cikartir. Basina tirnak isareti at.
    }
}
