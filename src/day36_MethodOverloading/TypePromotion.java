package day36_MethodOverloading;
/*
Method overloading allows methods to be created with the same name
The parameters must be different (Number of parameters, or the types of the parameters)
The return types should be the same, but if a method is overloaded it can be changed
Improve re-usability and readability
 */
public class TypePromotion {

    public static void main(String[] args) {
       use(3);
       use(3.1);
       use(3f);
       use(3L);
       use((short)9);

       use((double)3);
       short s = 5;
       use(s);

    }

    public static void use(float f){
        System.out.println("Calling float method");
    }

    public static void use(double d){
        System.out.println("Calling double method");
    }

    public static void use(long l){
        System.out.println("Calling long method");
    }

}
