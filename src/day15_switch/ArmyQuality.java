package day15_switch;

import java.util.Scanner;

public class ArmyQuality {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you a citizen?");
        boolean isCitizen = scan.nextBoolean();
        System.out.println("Are you a resident?");
        boolean isResident = scan.nextBoolean();
        System.out.println("Do you have a high school diploma?");
        boolean hasDiploma = scan.nextBoolean();
        System.out.println("How old are you?");
        int age = scan.nextInt();

        if((isCitizen || isResident) && hasDiploma && (age>=18 && age<=35)){
            System.out.println("You are qualified for the Army");

        }else{

            if(!isCitizen && !isResident){
                System.out.println("You must be a citizen or resident");
            }
            if(!hasDiploma){
                System.out.println("You must get a highschool diploma");
            }
            if(age<18 || age>35){
                System.out.println("Your age is not suitable for the Army");
            }

        }




















    }
}
