package day51_inheritance.access.a;
//I created this package in order to check which access modifier may be inherited to the ForInheritance class
public class ForInheritance extends First{


    public static void main(String[] args) {

        ForInheritance obj = new ForInheritance();
        System.out.println(obj.one);
        System.out.println(obj.two);
        System.out.println(obj.three);
      //  System.out.println(obj.four); This is private, can not be inherited


    }



}
