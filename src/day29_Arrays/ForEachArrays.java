package day29_Arrays;

public class ForEachArrays {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Traditional " + nums[i]);
        }


        System.out.println("---------------------------------------1");


        int[] numbers = {1, 2, 3};
        for (int element : numbers) {
            System.out.println("For each: " + element);
        }
        System.out.println("---------------------------------------2");

        String [] classes = {"Java", "soft skills", "selenium", "database","api"};
        // Traditional

        for (int i = 0; i < classes.length; i++) { // if we need specific index, we need to use traditional for
            System.out.println(classes[i]);
        }

        //For each

        for(String words : classes){
            System.out.println(words);
        }
        System.out.println("------------------------------------------3");

        // double example

        System.out.println();

        double[] prices = {10.4, 40.2, 410.2};

        for (double number:prices) {
            System.out.println("$ " + number);
        }
























    }
}
/*
int[] arr = {10, 20, 30};

for(int number : arr){
      System.out.println(number);
}
output
1
2
3


 */