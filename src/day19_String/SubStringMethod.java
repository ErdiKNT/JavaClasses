package day19_String;

public class SubStringMethod {
    public static void main(String[] args) {
        String str = "Fadime";
        //            012345
        System.out.println(str.substring(0));

        System.out.println(str.substring(1));

        System.out.println(str.substring(2));

        System.out.println(str.substring(3));

        System.out.println(str.substring(0) + "rdi"); //Fadimerdi

        System.out.println(str.substring(0,6));
    }
}
