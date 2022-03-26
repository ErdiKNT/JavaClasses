package day35_MethodsRecap;

import my_utilities.StringUtil;
//      packageName.className

/*
------------------------------------------------------------------
How to import all the classes:
 import packageName.*;
 * is wildcard. It will import all classes in the defined package.
------------------------------------------------------------------
How to import scanner and array classes with one import:
 import java.util.*;
 This will provide us both scanner and array.
 */


// We are going to call out methods in thi class.
public class UsingStringUtil {
    public static void main(String[] args) {

        System.out.println(StringUtil.reverse("KANT"));
        System.out.println(StringUtil.fix("FAdImE"));
        System.out.println(StringUtil.frequencyOfCharacter("apple",'p'));
        System.out.println(StringUtil.UniqueChar("aaaabccccccceddddddddd"));
        System.out.println(StringUtil.DuplicateChar("aaaabccccccceddddddddd"));

    }
}
