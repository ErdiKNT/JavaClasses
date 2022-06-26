package day58_Exception.bank;

public class InvalidCredentialsException extends Exception { // ==> Checked exception. Because this is a child class of Exception.

    public InvalidCredentialsException(String msg){
         super(msg);
    }




}
