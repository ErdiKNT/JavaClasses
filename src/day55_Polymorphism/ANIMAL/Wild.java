package day55_Polymorphism.ANIMAL;

public class Wild {
    public static void main(String[] args) {

        //all possible reference/object of Lizard

        //itself
        Lizard lizard = new Lizard();
        lizard.eat();
        lizard.name = "Lizard";
        lizard.numberOfClaws = 10;
        lizard.skinColor = "camo";
        System.out.println(lizard.name);
        System.out.println(lizard.numberOfClaws);
        System.out.println(lizard.skinColor);
        System.out.println();


        //Super class - reptile
        Reptile reptile = new Lizard();
        reptile.eat();
        reptile.name = "Lizard";
        reptile.numberOfClaws = 10;
//      reptile.skinColor = "camo"; ==> This is a variable in the subclass, Parent class can not get feature from the subclass.
        System.out.println(reptile.name);
        System.out.println(reptile.numberOfClaws);
//      System.out.println(reptile.skinColor);
        System.out.println();

        //super class - animal
        Animal animal = new Lizard();
        animal.eat();
        animal.name = "Lizard";
//      animal.numberOfClaws = 10; ==>NumberOfClaws and skin-color are in the subclass, Animal class is parent all of them, so we can not hire them.
//      animal.skinColor = "camo";
        System.out.println(animal.name);
//      System.out.println(animal.numberOfClaws);
//      System.out.println(animal.skinColor);
        System.out.println();

        Animal animal1 = new Reptile();

         /*
         We made 3 Lizard objects with 3 different references:

         Itself, Reptile(Super class), Animal (Super Class)

         but when it comes to execution, the object  implementation is run
          */
         /*
         Animal class is parent class for Reptile.
         Reptile is a parent class for Lizard.
         At the same time Animal is parent class for Lizard
          */


    }


}
/*
Seleniumda da polymorphism var
Webdriver driver = new ChromeDriver();
Webdriver driver = new FirefoxDriver;

Burada Webdriver ChromeDriver clasinin ve Firefox clasinin parentClassi, Bu yuzden bu iki clastan acilan objeleri
ana Parent clasin yani Webdriverin referencesina atayabiliriz.
 */