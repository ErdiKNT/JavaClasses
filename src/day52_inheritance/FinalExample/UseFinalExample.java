package day52_inheritance.FinalExample;

import day52_inheritance.FinalExample.FinalExample;

//public class UseFinalExample extends FinalExample { this is not valid because the FinalExample class was final, so it cannot be inherited
public class UseFinalExample {

    public static void main(String[] args) {

        System.out.println(FinalExample.PLANET);
//        FinalExample.PLANET = "Mars"; //---> Static final variables can not be changed later.

        FinalExample obj = new FinalExample(20);
        System.out.println(obj.a); // 5
        System.out.println(obj.b); // 20


//        obj.a = 4; ---> final instance variable also can not be changed after created.
//        obj.b = 40;

        System.out.println();
        FinalExample obj2 = new FinalExample(100);// Biz her yeni obje actigimizda yeni deger atayabiliriz, eger final variable final classta atanmadiysa.
        System.out.println(obj2.a);
        System.out.println(obj2.b);

        /*
        obj and obj2 were separate objects. Each object has its own copy of instance variables a and b, both are final, so they cannot be changed.
        a was hardcoded to be 5 in the class
        b was assigned in the constructor call
         */

    }
}
