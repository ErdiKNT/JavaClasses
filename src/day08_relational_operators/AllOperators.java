package day08_relational_operators;

public class AllOperators {
    public static void main(String[] args) {
        System.out.println(5 + 2 * 3);    //first priority is * and then +. that gives us 11.

        System.out.println(5 * 2 + 4 / 2);//12

        System.out.println(5 + 2 > 4 - 3);//true
        //                   7   > 4 - 3
        //                   7   >   1
        //                     true

        int a  = 20;
        int b  = -a-- + a++ + --a * a--;//360
        //       -20  + 19  +  19 *  19
        System.out.println(b);





    }
}
