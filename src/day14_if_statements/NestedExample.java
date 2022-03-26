package day14_if_statements;

public class NestedExample {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = false;


        if (a) {
            System.out.println("2");    //will be printed
            if (b) {
                System.out.println("4");//will be printed
            }
            if (c) {
                System.out.println("5");
            }else{
                System.out.println("6");//will be printed
            }


        } else {
            System.out.println("3");
        }
    }
}
