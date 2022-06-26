package day51_inheritance.access.b;

import day51_inheritance.access.a.First;

public class Four extends First {
    // different class, different package
    // with inheritance

    public static void main(String[] args) {
        //This is just calling not inheriting.
        First obj = new First();
        System.out.println(obj.one);
//      System.out.println(obj.two);
//      System.out.println(obj.three);
//      System.out.println(obj.four);
        System.out.println(obj.five);


        Four obj2 = new Four();
        System.out.println(obj2.one); // public
        System.out.println(obj2.two); // protected
//      System.out.println(obj2.three);// Default
//      System.out.println(obj2.four); // Private
        System.out.println(obj2.five);// ===> This is a Final public int we are able to inherit.

    }

    /*
    line 13 is trying to directly access a protected variable outside the package. You cannot directly access any protected information outside the package
    line 19 we are able to access the two variable because it is inherited from the First class to the Four class, so the two variable belongs to the objects of the Four class (subclass)
     */

}
