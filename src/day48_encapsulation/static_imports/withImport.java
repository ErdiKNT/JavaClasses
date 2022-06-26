package day48_encapsulation.static_imports;
import static java.lang.Math.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.*;  // Burada javaUtil paketindeki butun static memberlari cagirmis oluyoruz.
import static my_utilities.StringUtil.*;
// Bu sayede class adini yazmamiza gerek yok static memberlari cagirmak icin

public class withImport {
    public static void main(String[] args) {
        int[] a = {4,12,5,25};

        sort(a);

        System.out.println(Arrays.toString(a));

        System.out.println(PI); //Yukarida ozel import seklini kullandik. Math clasi icindeki tum static memberlari cagiriyoruz
        // Class adini kullanmamiza gerek yok static memberlari cagirmak icin.

        System.out.println(a);

        System.out.println(reverse("apple"));



    }
}
