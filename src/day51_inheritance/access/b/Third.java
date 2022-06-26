package day51_inheritance.access.b;
import day51_inheritance.access.a.First;
public class Third {
    // different class, different package

    public static void main(String[] args) {
        First obj = new First();
        System.out.println(obj.one);   // ---> public
//        System.out.println(obj.two);
//        System.out.println(obj.three);
//        System.out.println(obj.four);
        System.out.println(obj.five);  // ---> final
    }

    // four is private, only visible in the same class
    // three is default, only visible in the same package
    // two is protected, no inheritance, so no visibility
}
