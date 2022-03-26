package day30_Arrays;

public class ReverseSentence {

    public static void main(String[] args) {

        String str="today is monday";
        String[]arr=str.split(" ");
        String reverse="";
        for (int i = arr.length-1; i >=0 ; i--) {
            reverse+=arr[i]+" ";

        }
        System.out.println(reverse.trim());
    }
}
/*
Given a sentence
today is monday

reverse the sentence
monday is today
 */