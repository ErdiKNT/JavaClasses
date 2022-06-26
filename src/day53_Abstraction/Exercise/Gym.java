package day53_Abstraction.Exercise;

public class Gym {
    public static void main(String[] args) {
       // Exercise obj1 = new Exercise();  This is abstract class we  can not create object

        Running obj2 = new Running();
        System.out.println(obj2.name); // Running
        obj2.performExercise(); // Running for fun, not sure who does this
        System.out.println(obj2.getCaloriesBurned(2));// 10




    }
}
