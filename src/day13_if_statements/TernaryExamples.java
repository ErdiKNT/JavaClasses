package day13_if_statements;

public class TernaryExamples {
    public static void main(String[] args) {
        int a = 5;

        if (a % 2 == 0) {
            System.out.println("Even");
        } else if (a % 2 != 0) {
            System.out.println("odd");
        }
        System.out.println("------------------------");
        String str;
        int b = 2;
        str = (b % 2 == 0) ? "Even" : "odd"; //we can not use ternary in situation where is more complicated. We can also use int or boolean, not only string.
        System.out.println(str);
        System.out.println("------------------------");
        int c = 4;
        String str1;

        str1 = (c > 0) ? "Positive Number" : "Negative Number";
        System.out.println(str1);

        System.out.println("-------------------------");

        int number = -4;

        String sign = (number>0)? "Positive" : (number<0)? "Negative" : "Zero";
        System.out.println(sign);





















    }
}
