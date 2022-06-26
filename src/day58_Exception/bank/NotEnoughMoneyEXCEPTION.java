package day58_Exception.bank;

public class NotEnoughMoneyEXCEPTION extends RuntimeException { // ==> Now this is a custom exception class. unchecked exception

    public NotEnoughMoneyEXCEPTION() { // ==> We made this constructor in order to call this exception into another class
           super("Not enough money in the account");// ==> We are inheriting constructor from the RuntimeException class
    }

    public NotEnoughMoneyEXCEPTION(String msg){
        super(msg);
    }



}
