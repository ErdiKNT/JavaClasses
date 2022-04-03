package day37_Wrapper_ArrayList;

public class WrapperMethods {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------------------------------------------------------");
        // The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.
        String name = "I was born in 1992";
        int date = Integer.parseInt(name.substring(14)); //We changed string into primitive int type.
        System.out.println(date); //1992
        System.out.println(date+20);//2012 This line makes calculation because 1992 is not a string anymore, it is a datatype.

        String name1 = "1992";
        System.out.println(name1 + 20); //In this line 1992 is not a primitive type, it is a string.
        // Calculation will not be happened until we turn it into an int type. [199220].
        System.out.println("----------------------------------------------------------------------------------------------------");

        //                              [------------- ParseInt versus ValueOf-----------------]
        //From object to primitive data type. [Unboxing]  <-------> The reverse is called as an [Autoboxing].
        //*                        [*]
        //Difference between parseInt and Value of is valueOf(String) returns a new Integer() object whereas parseInt(String) returns a primitive int.
        //**                                                                                                                              [*]
        String str = "30";
        int a = Integer.valueOf(str); // If we want to obtain primitive data type from a given string, using valueOf is not the best way.
        //                                  [*]                                     [*]
        int primitive = Integer.parseInt(str); // This is the method that if we need to obtain primitive data type from the given string object.
        //From object to object. [Autoboxing]
        Integer object = Integer.parseInt(str); // Converts the "30" String into the Integer object.
        //                                                                          [*]
        Integer object1 = Integer.valueOf(str); // Converts the "30" String into the Integer object.
        //We can make this process reverse.
        String str1 = String.valueOf(25);
        System.out.println(str1); // This is not a primitive int data type anymore, this is just a string.

        System.out.println("----------------------------------------------------------------------------------------------------------");
        //                               [-------------- Why Wrapper Methods???? -----------------]
        /*
        As we know we can use many object methods in the string class. Strings are non-primitive and objects. We are not able to use useful many methods with
                                                                                                                          [*] [*]
        primitive data types. But wrapper classes are the best way that converts primitive data types into objects, then we are able to use some methods to use
              [**]                                              [*]     [*]                                                            [*]
        it.
         */
        int b = 3; // Try this!!!! After you type b which is variable name of the primitive, press the '.' you are not going to see any method to use it.
        Integer b1 = Integer.valueOf(b); // Now, once you type b1 variable name, then put the '.', now you are able to see such a beautiful methods in order to
        //use them. Such methods are toString (That gives you the opportunity to make your int data type into string) or compareTo().
        String method = b1.toString(); // Now, this one became a string. From primitive data type into the object.
        String digits = "123456";
        int digit =0;
        int upper =0;
        int lower =0;
        for (int i = 0; i < digits.length(); i++) {
            char ch = digits.charAt(i);
            if(Character.isDigit(ch)){
                digit++;
            }else if(Character.isUpperCase(ch)){
                upper++;
            }else if(Character.isLowerCase(ch)){
                lower++;
            }
        }

















    }
}
