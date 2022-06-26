package day58_Exception.bank;

public class Bank {

    double balance;
   // In the below method, we made an unchecked exception, we do not need to handle with this.
    public void withdraw(double amountToTakeOut){

        if(amountToTakeOut > balance){ // throw is how we cause the exception
            throw new NotEnoughMoneyEXCEPTION("Balance only has " + balance);
        }

       balance = balance - amountToTakeOut;


    }

   // In the below method, we made a checked exception, we need to handle with this exception. But, we are going to ignore it. User will handle it.
    public void LogIn(String userName, String password) throws InvalidCredentialsException {
        if(!userName.equals("jamesbond")){
              throw new InvalidCredentialsException("Invalid UserName");

        }

        if(!password.equals("007")){
            throw new InvalidCredentialsException("Invalid password");
        }

        System.out.println("LOGIN");
    }













}
