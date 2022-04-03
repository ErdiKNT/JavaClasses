package day37_Wrapper_ArrayList;

public class GoogleSearch {
    public static void main(String[] args) {

        String result = "About 2,550,000,000 results (1.00 seconds) ";
        String [] arr = result.split(" ");

        String resultStr = arr[1].replace(",","");
        String timeStr = arr[3].substring(1);


        System.out.println(resultStr); //  String type 2550000000
        System.out.println(timeStr);   //  1.00

        Long resultNumber = Long.parseLong(resultStr);
        System.out.println(resultNumber);// long type 2550000000

        Double timeNumber = Double.parseDouble(timeStr);
        System.out.println(timeNumber);

        if(resultNumber >= 0){
            System.out.println("TEST CASE PASSED - POSITIVE NUMBER");
        }

        if(timeNumber <= 2 && timeNumber>= 0){
            System.out.println("TEST CASE PASSED - UNDER 2 SECONDS");
        }























    }
}
