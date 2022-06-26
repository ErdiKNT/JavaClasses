package day46_Static;

import day47_Encapsulation.AccessModifier;

public class AccessModifierOutsidePackage {

        public static void main(String[] args) {
            // We are in the different package and class
            AccessModifier obj = new AccessModifier();
            System.out.println(obj.a);

          //  System.out.println(obj.b);

          //  System.out.println(obj.c);

            System.out.println(AccessModifier.x);

          //  System.out.println(AccessModifier.y);

           // System.out.println(AccessModifier.z);

            // This time we are not only in different class also in the different package
            // We are not able to access default values in the new package, we can only access to public variables
            /*
            So what is accessible outside a package
            only public is accessible outside a package
             */
        }

}
