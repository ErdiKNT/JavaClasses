package day30_Arrays;

public class ReverseMiddleWord {
    public static void main(String[] args) {

        String str="java always fun";
        //            0    1      2
        String[]arr=str.split(" "); // we switch string into array.
        String reverse = "";
        char[] middleWord = arr[1].toCharArray(); // [a, l, w, a, y, s]
        for (int i = middleWord.length-1; i >=0 ; i--) {
            reverse+=middleWord[i];// s, y ,a, w, l, a
        }
        System.out.println(arr[0] +" "+ reverse +" "+ arr[2]);

    }
}

/*
        Have a sentence with 3 words
        reverse the middle word

        output:
        java syawla fun
         */