package day32_MultidimensionalArrays;

import java.util.Arrays;

public class CopyExample {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = a;
        System.out.println(Arrays.toString(a));//[1, 2, 3]
        System.out.println(Arrays.toString(b));//[1, 2, 3]

        a[0] = 100;
        b[1] = 200;

        System.out.println(Arrays.toString(a));//[100, 200, 3]
        System.out.println(Arrays.toString(b));//[100, 200, 3]

        int[] z = Arrays.copyOf(a, a.length);
        System.out.println(Arrays.toString(z)); // [100, 200, 3]

        int[] z1 = Arrays.copyOf(a, a.length - 1);
        System.out.println(Arrays.toString(z1)); //[100, 200]


    }
}
