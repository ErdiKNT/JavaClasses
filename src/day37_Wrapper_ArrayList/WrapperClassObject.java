package day37_Wrapper_ArrayList;

public class WrapperClassObject {
    public static void main(String[] args) {
        int a = 5; //This is our primitive type
        // What can we do with this: assign/reassign, math, casting
        // What can`t we do with this: a.method()

        Integer a2 = new Integer(10);
        Integer a3 = 20; //Autoboxing - primitive --> Object // Now we can apply some methods.
        int a4 = a3; // unboxing - object --> Primitive

        System.out.println(a); // 5
        System.out.println(a2);// 10
        System.out.println(a3);// 20

        byte b = 2;
        Byte b2 = 20;
        b2.toString(); // For example: Now we can apply toString Method at the b2. Then we are able to make it string.
        System.out.println(b2.toString() + 2); // The result is 202 because b2 is a string object.
        String str = String.valueOf(b2); // Converts Byte b2 object into String object


    }

}
