package day42_Custom_Classes;

public class Car {
    /*
    create instance variables:
    model, year, color, fuel level (percent number)
     */
    String model;
    int year;
    String color;
    double fuelLevel;

    /*
    create instance methods:
     - drive(): [void]
        prints: driving $model
        subtract 5 from the fuel amount
     */

    public void drive() {
        System.out.println("Driving " + model);
        System.out.println((fuelLevel < 30) ? "Tank level is low" : "Your tank level is good, you are good to go");

        fuelLevel = fuelLevel - 5;
    }

    /*
    - fillTank(): [void]
        prints: filling tank
        fuel level will be maxed at 100
     */
    public void fillingTank() {
        System.out.println("Filling Tank");
        if (fuelLevel < 100) {
            fuelLevel = fuelLevel + 10;
        }
        if (fuelLevel == 100) {
            System.out.println("Gas tank is full, You are good to go");
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", fuelLevel=" + fuelLevel +
                '}';
    }
}
