package day53_Abstraction.Exercise;
//We can not use abstract method into normal class, class must be also an abstract class.
public  abstract class Exercise {
// We have constructor to initialize the name.

    final String name;
    public Exercise(String name){
        this.name=name;
    }

    public abstract void performExercise();

    public abstract int getCaloriesBurned(int minutes);
}
/*
We can not use static, private or final methods in the abstract class.
We can not create object from abstract class.
But we are able to make construct in the abstract class, and we defined name variable into constructor. Also, we made it final because we do not want to change
it later.
*/