package day08_relational_operators;

public class OperatorPractices3 {
    public static void main(String[] args) {

        int h = 5;
        int p = h;// p  gets assigned the value of h, which is 5.

        h++;//6 post increment, no other code, so it adds 1. But p and h are separate values when we made change on h that does not mean p will also change.
        System.out.println("h = "+ h);//6
        System.out.println("p = " + p);//5

        int k = h++;//post increment, get the value first, which is 6.In this line, h is not yet became 7. 6 is assigned to the k but then h will be 7 but
                    //we did not touch the k, so it will be stay like 6.

        System.out.println("h = " + h);//7 in here I think, both of the h and k will be stored in the different location in the memory,
                                       // That`s why k is not changed
        System.out.println("k = " + k);//6

        int g = ++h;// h is 8 and 8 will be assigned into the g.

        System.out.println("h = " + h);//8
        System.out.println("g = " + g);//8


    }
}
