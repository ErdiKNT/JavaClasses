package day48_encapsulation.static_imports;

import my_utilities.StringUtil;

import java.util.Arrays;

public class Normal {
    public static void main(String[] args) {
        int[] a = {4,12,5,25};

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        System.out.println(Math.PI); // This variable is static because we used MATH className to call the PI variable

        System.out.println(StringUtil.reverse("java")); // Bu metodu biz yazmistik ve static oldugu icin class adi ile cagirdik



    }
}
