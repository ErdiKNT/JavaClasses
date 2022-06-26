package day54_abstraction.language;

public class Translator {
    public static void main(String[] args) {

      //  Language obj = new Language() ==> we can not make an object from interface

        Spanish obj = new Spanish();
        obj.hi();
        obj.bye();

        System.out.println();

        Turkish obj1 = new Turkish();
        obj1.hi();
        obj1.bye();

        System.out.println(Language.PLANET);


    }
}
