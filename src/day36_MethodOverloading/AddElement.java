package day36_MethodOverloading;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = addElement(a, 4);
        System.out.println(Arrays.toString(b)); // [1, 2, 3, 4]

        String[] origin = {"Erdi", "Fadime"};
        String[] added = addElement(origin, "ayla");
        System.out.println(Arrays.toString(added));//  [Erdi, Fadime, ayla]

        int[] elements = {1, 2};
        System.out.println(Arrays.toString(addElements(a,elements)));// [1, 2, 3, 0, 2]
    }


    public static int[] addElement(int[] original, int elementToAdd) {
        int[] newArray = new int[original.length + 1];
        for (int i = 0; i < original.length; i++) {
            newArray[i] = original[i];
        }

        newArray[newArray.length - 1] = elementToAdd; //Adding the new element to the end of the new array
        return newArray;

    }

    public static String[] addElement(String[] original, String element) {
        String[] newArray = new String[original.length + 1];
        for (int i = 0; i < original.length; i++) {
            newArray[i] = original[i];
        }
        newArray[newArray.length - 1] = element;
        return newArray;
    }

    public static int[] addElements(int[] original, int[] elementsToAdd) {
        int[] newArray = new int[original.length + elementsToAdd.length];
        for (int i = 0, j=0; i < newArray.length; i++) {

            if (i < original.length) {
                newArray[i] = original[i];
            } else {
                newArray[i] = elementsToAdd[j++];

            }

        }

        return newArray;

    }


}
