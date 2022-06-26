package day45_Custom_Classes;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomAndStaticUse {
    public static void main(String[] args) {



        ArrayList<String> list = new ArrayList<>(Arrays.asList("hold", "learn"));
        // This is String class and object. Basically, I can add this object into the ArrayList. I can do the same thing on my custom object where placed in my custom class
        String str1 = new String("Kant");
        list.add(str1);
        System.out.println(list);

        // This is my custom class and object just like String class and it`s object. I did the same thing, I added my object into ArrayList
        CustomAndStaticClass obj = new CustomAndStaticClass("Kant");
        ArrayList<CustomAndStaticClass> listnew = new ArrayList<>();
        listnew.add(obj);
        System.out.println(listnew);
        System.out.println(listnew.get(0).length());






        // I called my instance variable using my object.
        obj.str = "Erdi";
        System.out.println(obj);

        // These are my static variables, usually can be called by ClassName, but we can call them using objName.
        System.out.println(CustomAndStaticClass.str4);
        System.out.println(CustomAndStaticClass.str5);
        // This is how I manipulate my static variable with non-static method.
        System.out.println(obj.str4.length());// ==> Buradaki length method benim custom clasimdaki degil, string clasindaki length method

        /*
        object olusturup ve kendi metodlarimizi olusturup, kendi objemize manipulation yapabiliriz. Tipki String classindaki objeye, length metodunu
        uyguladigimiz gibi. Ben burada custom class ve obje acip kendi olusturdugum uzunluk bulma metodunu kendi olusturdugum objeme uyarladim. Olusturdugum
        metod static degil bu nedenle objeme bagli calisiyor. Static variablerda olusturdum. Statik variablelar obje genelde class adiyla cagrilirlar, java
        her ne kadar istemesede obje ilede static variablerimizi cagirabiliriz. Bunun bize faydasi ne? Eger statik olmayan bir metodumuz varsa, bu metodu statik
        variablerimiza uygulayamayiz. Fakat ben statik variablimi obje ile cagirirsam, objem ile calisan metodumu statik variable ilede calistirabilirim. Bir diger
        onemli husus ise ben olusturdugum objemi String klasindaki referansa koyup string klasinin sahip oldugu metodlari kendi objemde kullanabilirim, veya buna
        alternatif olarak kendi custom klasimda, tipki string klasinda mevcut olan metodlari yazip kendimde developer gibi kendi objectimi manipule edebilirim.
        Burada String klasinda var olan length() metodunu, ben kendi custom klasimda yazip kendi objeme uyarladim, tipki String clasinda oldugu gibi.

         */





    }
}
