package day12_if_statement;

public class DayOfWeek {
    public static void main(String[] args) {
        int number = 5;
        if(number==1){
            System.out.println("Monday");
        }else if(number==2){
            System.out.println("Tuesday");
        }else if(number==3){
            System.out.println("Wednesday");
        }else if(number==4){
            System.out.println("Thursday");
        }else if(number==5){
            System.out.println("Friday");
        }else if(number==6){
            System.out.println("Saturday");
        }else if(number==7){
            System.out.println("Sunday");
        }else{
            System.out.println("Invalid number entered");
        }
    }
}
/*
Declare and assign a number(day)
     1-Monday
     2-Tuesday
     ..
     6-Saturday
     7-Sunday

     Ex: 2
         -Tuesday
 */