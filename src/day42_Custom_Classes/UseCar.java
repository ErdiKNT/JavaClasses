package day42_Custom_Classes;

public class UseCar {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.model = "Volvo";
        car1.year = 2022;
        car1.color = "white";
        car1.fuelLevel = 40;

        System.out.println(car1);

        car1.drive();
        System.out.println();
        car1.drive();
        System.out.println();
        car1.drive();
        System.out.println();
        car1.drive();

        System.out.println(car1);

        car1.fillingTank();

        System.out.println(car1);

        car1.fillingTank();

        System.out.println(car1);

        car1.drive();

        System.out.println(car1);



    }
}
