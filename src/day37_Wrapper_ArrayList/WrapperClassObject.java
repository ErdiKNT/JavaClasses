package day37_Wrapper_ArrayList;

public class WrapperClassObject {
    public static void main(String[] args) {
        int a = 5; //This is our primitive type
        // What can we do with this: assign/reassign, math, casting
        // What can`t we do with this: a.method()

        Integer a2 = new Integer(10);
        Integer a3 = 20; //Autoboxing - primitive --> Object
        int a4 = a3; // unboxing - object --> Primitive

        System.out.println(a);
        System.out.println(a2);
        System.out.println(a3);

        byte b = 2;
        Byte b2 = 20;



    }

}
