package day06_arithmetic_operators;

public class BasicCalculator {
    public static void main(String[] args) {
        double num1 = 5;
        double num2 = 4;

        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiple = num1 * num2;
        double dividing = num1 / num2;
        double remainder = num1 % num2;


        System.out.println(num1 + " + " + num2 + " = " + (int)addition);
        System.out.println(num1 + " - " + num2 + " = " + (int)subtraction);
        System.out.println(num1 + " * " + num2 + " = " + (int)multiple);
        System.out.println(num1 + " / " + num2 + " = " + (int)dividing);
        System.out.println(num1 + " % " + num2 + " = " + (int)remainder);

        System.out.println(""+num1+num2); // It will not calculate because at first we used double quote, that makes it string.
        System.out.println(""+(num1+num2));// Burada islem onceligi var. Parantez icinden basladigi icin islemi yapti.




    }
}
