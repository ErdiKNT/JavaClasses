package day47_Encapsulation;

public class AccessInPackage {
    public static void main(String[] args) {
        // In the same package but different class, we are not able to access private
        AccessModifier obj = new AccessModifier();
        System.out.println(obj.a);

        System.out.println(obj.b);

     //   System.out.println(obj.c);

        System.out.println(AccessModifier.x);

        System.out.println(AccessModifier.y);

      //  System.out.println(AccessModifier.z);
        //We can not access to the "c" and "z", because they are private


    }
}
