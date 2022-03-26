package day33_VoidMethods;

public class MyMathClass {
    public static void add(double numOne, double numTwo){
        System.out.println(numOne + "+" + numTwo + "=" + (numOne+numTwo));
    }

    public static void subtraction(double numOne, double numTwo){
        System.out.println(numOne + "-" + numTwo + "=" + (numOne-numTwo));
    }

    public static void multiply(double numOne, double numTwo){
        System.out.println(numOne + "*" + numTwo + "=" + (numOne*numTwo));
    }

    public static void division(double numOne, double numTwo){
        if(numTwo != 0){
            System.out.println(numOne + "/" + numTwo + "=" + (numOne/numTwo));
        }else{
            System.err.println("Cannot divide by 0");
        }
    }


    public static void main(String[] args) {
        add(4.5,5.2);
        // int a = add(3.4, 12.2); we can not assign anything, because our methods are void, there is no return value
        division(6,0); // Cannot divide by 0
    }

}
