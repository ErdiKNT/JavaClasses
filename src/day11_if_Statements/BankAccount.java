package day11_if_Statements;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your account value");
        double accountValue = scan.nextDouble();
        System.out.println("How much do you want to withdraw");
        double withdraw = scan.nextDouble();
        double result = accountValue-withdraw;
        if(accountValue>withdraw){
            System.out.println("Your balance is: " + result);
        }else if(withdraw>accountValue){
            System.out.println("You tried to withdraw more money that you had in the account, Now your balance is: " + result);
        }


    }
}
/*
Task: Hard code -->dynamic
Create a double value for the account balance
create a double value for how much you want to withdraw

check the balance after the withdrawal
   if you tried to withdraw more money that you had in the account add a negative overdraft fee to the balance: -100
   in both cases print the remaining balance after withdrawing, with overdraft free applied if you went over.


 */