package day06_arithmetic_operators;

public class Pizza {
    public static void main(String[] args) {
        String typeOfPizza = "Chicken pizza";
        int numberOfSlices = 8;
        int numberOfPeople = 4;
        System.out.println("We ordered " + typeOfPizza + " with " + numberOfSlices + " slices, " + numberOfPeople + " people ate " + (numberOfSlices/numberOfPeople)
        +" slices" + " and 0 left over.");
    }
}
