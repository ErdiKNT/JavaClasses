package day45_Custom_Classes;

public class CustomAndStaticClass {
    String str;


    public CustomAndStaticClass(String str){
        this.str=str;
    }
    static String str4;
    static String str5;

    static{

        str4 = "fadime Kant";
        str5 = "Erdi Kant";

    }



    public String reverse() {
        String reverse = "";
        for (int i = str.length()-1; i >=0; i--) {
            reverse+=str.charAt(i);
        }
        return reverse;


    }

    public int length(){

        int count = 0;
        String word = "";
        for (int i = 0; i < str.length(); i++) {
            word+=str.charAt(i);
            count++;

        }
        return count;
    }


    @Override
    public String toString() {
        return str;

    }
}
