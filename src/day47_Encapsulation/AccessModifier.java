package day47_Encapsulation;

public class AccessModifier {

    public int a; // ---> public
    int b; // ---> default
    private int c;// ---> private

    public static int x; // --->public
    static int y; // --->default
    private static int z; // --->private

     // In the same class:
    public static void main(String[] args) {
        // We accessed all the information within the same class.
        AccessModifier obj = new AccessModifier();
        System.out.println(obj.a);

        System.out.println(obj.b);

        System.out.println(obj.c);

        System.out.println(AccessModifier.x);

        System.out.println(AccessModifier.y);

        System.out.println(AccessModifier.z);

        /*
        Private ---> Can be accessed only in the same class
        default ---> Can be accessed in the same class or different class in the same package.
        public  ---> Can be accessed from everywhere
        protected ---> We will talk about later
         */
    }
       /*
       OOP principles
           1) Encapsulation
           2) inheritance
           3) Abstraction
           4) Polymorphism
        */


}
