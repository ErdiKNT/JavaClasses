package day37_Wrapper_ArrayList;

public class ValueVSParse {
    public static void main(String[] args) {
        String s = "30";
        int seconds = Integer.parseInt(s); // Converts the "30" String into an int of 30. [Unboxing]

        Integer i = Integer.valueOf(s); // Converts the "30" String into the Integer wrapper class object. [AutoBoxing]
        System.out.println(i); // Object 30. However, valueOf(String) returns a new Integer() object whereas parseInt(String) returns a primitive int.
        // Do not forget primitive types does not work with ArrayList but objects does.
        int i2 = Integer.valueOf(s); //[We are unboxing here]
        System.out.println(i2); // Primitive type 30

        Integer i3 = Integer.parseInt(s);
        //Integer.parseInt(s); --> Converts the "30" String into the Integer object.

        String s2  = String.valueOf(30);
        System.out.println(s2 + 5); // 305

    }
}
