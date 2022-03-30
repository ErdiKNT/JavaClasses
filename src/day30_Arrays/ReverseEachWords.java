package day30_Arrays;

public class ReverseEachWords {

    public static void main(String[] args) {

        String str="It started to snow in Chicago";
        String[]arr=str.split(" ");
        String str1 = "";
        String reverse="";
        String sum = "";
        for (int i = 0; i < arr.length; i++) {
             str1 = arr[i];
             reverse="";
            for (int j = str1.length()-1; j >=0 ; j--) {
                  reverse+=str1.charAt(j);
            }

            sum+=reverse+" ";
        }
        System.out.println(sum);




    }
}

/*
Reverse Each word
Given a String, reverse each individual word and print the result
Hint: Use a nested loop, split
Input:
It started to snow in Chicago
Output:
tI detrats ot wons ni ogacihC
 */