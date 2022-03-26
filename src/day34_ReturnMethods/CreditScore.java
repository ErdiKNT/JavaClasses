package day34_ReturnMethods;

public class CreditScore {
    public static void main(String[] args) {
        getCreditScore(); // This is return method, we need to use it, we can not do anything just typing the name of the return method.
        int score = getCreditScore(); // Now, we used it.
        System.out.println(score);
        System.out.println(getCreditScore() + 50); // 800 + 50 = 850 But, we can not do the same thing for void method.

        System.out.println(isGoodCreditScore(750)); // true
        System.out.println(isGoodCreditScore(getCreditScore())); // true

        System.out.println(isGoodCreditScore(500) ? "Good Score" : "Bad Score");


    }

    public static int getCreditScore() {
        return 800;

    }

    public static boolean isGoodCreditScore(int creditScore) {
        if (creditScore > 700) {
            return true;
        } else {
            return false;
        }
    }
    /*
    public static boolean isGoodCreditScore1 (int creditScore){
        return creditScore>700;
    }
   */
}
