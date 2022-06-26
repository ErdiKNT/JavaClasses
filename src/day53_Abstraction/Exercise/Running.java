package day53_Abstraction.Exercise;
// We need to call everything inside the abstract class to the subclass
public class Running extends Exercise{

    public Running(){
        // Super calls parent constructor
        super("Running");
    }



    @Override
    public void performExercise(){
        System.out.println("Running for fun, not sure who does this");
    }

    @Override
    public int getCaloriesBurned(int minutes){
        return minutes*5;
    }


}
