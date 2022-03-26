package day35_MethodsRecap;

import my_utilities.ArrayUtil;

public class UsingArrayUtil {
    public static void main(String[] args) {
         int[] num ={1,2,3,4,5,6,7};
        System.out.println(ArrayUtil.maxNumber(num));
        System.out.println(ArrayUtil.minNumber(num));
        System.out.println(ArrayUtil.Contain(num,3));
    }
}
