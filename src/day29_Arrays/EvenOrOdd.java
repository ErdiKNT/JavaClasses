package day29_Arrays;

public class EvenOrOdd {
    public static void main(String[] args) {
        int[] nums = {4, 1, 3, 12, 5, 20, 13};
        int even = 0;
        int odd = 0;
        String evenNums = "";
        String oddNums = "";

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 == 0) {
                even++;
                evenNums += nums[i] + " ";
            } else {
                odd++;
                oddNums += nums[i] + " ";
            }

        }

        System.out.println("Even counter: " + even);
        System.out.println("Even numbers: " + evenNums);

        System.out.println("Odd counter: " + odd);
        System.out.println("Odd numbers: " + oddNums);
    }
}
