package day42_Custom_Classes;

public class UsingAnimal {
    public static void main(String[] args) {

        Animal bird = new Animal();

        bird.population = 100000;
        bird.species = " Bird";

        System.out.println(bird.toString()); // We do not need to call toString
        System.out.println(bird);



    }

}
/*
Ex: Student obj = new Student();
    obj.name = "james";
    obj.batchNumber = 26;
    System.out.println(obj); --> memory location

   - all classes have a method called toString which is automatically called when printing
     so if we made the toString method in the Student class:

   - public String toString{
        return name + " " + batchNumber
     }

   now if we print the object:
       System.out.println(obj); --> We do not need to type toString method





 */