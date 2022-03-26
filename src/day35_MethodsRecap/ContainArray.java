package day35_MethodsRecap;

public class ContainArray {
    public static boolean Contain(int[] num, int number) {

        for (int i = 0; i < num.length; i++) {
            if (num[i] == number) {
                return true;
            }
        }
        return false;
    }
}
/*
Contains
create a method that will accept an int array and an int number. Check and
return if the given number is in the array.
 */