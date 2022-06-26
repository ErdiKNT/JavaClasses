package day42_Custom_Classes;

public class AllPeople {
    public static void main(String[] args) {
        // These are not valid ways to access instance variables
        // System.out.println(name);
        // System.out.println(age);
        // System.out.println(Person.name);
        // System.out.println(Person.age);

        //This creates an object of the Person class
        Person personOne = new Person();

        Person personTwo = new Person();

        //Accessing the instance variables

        personOne.name = "James";
        personOne.age = 40;
        personOne.height = 5.10;
        personOne.isMarried = true;

        //Printing the instance variables

        System.out.println(personOne.name);
        System.out.println(personOne.age);
        System.out.println(personOne.height);
        System.out.println(personOne.isMarried);

        //Printing the instance variables for personTwo

        System.out.println();

        System.out.println(personTwo.name);     // null
        System.out.println(personTwo.age);      // 0
        System.out.println(personTwo.height);   // 0.0
        System.out.println(personTwo.isMarried);// false


    }

}
