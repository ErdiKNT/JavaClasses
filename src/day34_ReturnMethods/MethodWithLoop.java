package day34_ReturnMethods;

public class MethodWithLoop {
    public static void main(String[] args) {
        int[] arr = {5, 1, 7, 13, 5};
        System.out.println(firstEvenNumber(arr));


    }

    public static int firstEvenNumber(int[] nums) {
        for (int num : nums) {
            if (num % 2 == 0) {
                return num;
            }


        }
        return 0; // We need to use return also in method. Because what if we do not put even number then, return will not run anytime, but we need return.

    }
}
