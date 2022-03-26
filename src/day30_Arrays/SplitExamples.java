package day30_Arrays;

import java.util.Arrays;

public class SplitExamples {

    public static void main(String[] args) {

        String s="monday,tuesday,wednesday,thursday,friday,saturday,sunday";
        String[]days=s.split(",");//Stringi Arraye dondurme methdu
        System.out.println(Arrays.toString(days));

        for(String day:days){
            System.out.println(day); //for each ile Array Stringe donmus oldu
        }
        System.out.println();
        String[]withoutDay=s.split("day");
        for(String each:withoutDay){
            System.out.println(each);

        }
        System.out.println();
        String str="Jan-Feb-Mar-Apr-May-Jun-Aug-Sep-Oct-Nov-Dec";
        String[]months=str.split("-");
        for(String each:months){
            System.out.println(each);
        }

    }
}
