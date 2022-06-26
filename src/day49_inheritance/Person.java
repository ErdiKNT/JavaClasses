package day49_inheritance;
// inheritance ---> miras
/*
What is inherited?
  - All public variables and methods
  - All protected variables and methods
  - Default variables and method when the classes are in the same package
What is not inherited?
  - Constructors
  - All private variables and methods
  - Default variables and method when the classes are not in the same package
 */
public class Person {

    String name;
    int age;
    String favoredHobby;


    public void talk(){
        System.out.println(name + " is talking");
    }


}
/*
  - Person is the Super Class

        name, age, favored hobby

        talk()

  - Student class is the subclass of Person

        int fun level

        study()




 */