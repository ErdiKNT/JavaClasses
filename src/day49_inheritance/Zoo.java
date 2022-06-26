package day49_inheritance;
/*
object ile instance variables ve methodlari cagiriyoruz
Class ile static variables and methodlari cagirabiliyoruz.
 */
public class Zoo {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.species = "Generic Animal";
        animal.numberOfLegs = 0;
        animal.walk();






        Dog dog = new Dog();
        dog.species = "Dog";
        dog.numberOfLegs = 4;
        dog.bark(); // Dog is barking
        dog.walk(); // Dog is walking
        System.out.println(dog.str);
        dog.walk2();

       // dog.roar();

        Lion lion = new Lion();
        lion.species = "Lion";
        lion.roar(); // Lion is roaring
        lion.walk(); // Lion is walking
       // lion.bark();
        // How many instance variables does the lion object access to? --> 3
        // How many instance methods does the lion object access to? -->2


    }
}
