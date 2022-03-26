package day28_ArraysIntro;

public class MaxMin {
    public static void main(String[] args) {
        int[] numbers = {500, 120, -80, 90, 250, -10};
        int min = numbers[0]; // 500
        int max = numbers[0]; // 500
        for (int i = 0; i < numbers.length; i++) {
               if(min>numbers[i]){
                   min=numbers[i];
               }
               if(max<numbers[i]){
                   max=numbers[i];
               }

        }
        System.out.println(min);
        System.out.println(max);



    }
}
/*
Declare and assign an array
500, 120, -80, 90, 250, -10
 find the biggest number in the array
 find the smallest number in the array
 */