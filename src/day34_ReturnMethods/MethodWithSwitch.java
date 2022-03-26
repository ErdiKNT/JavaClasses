package day34_ReturnMethods;

public class MethodWithSwitch {
    public static String dayInWords(int day) {

        switch (day) {
            case 1:
               return "Monday";
              // We do not need to use break. Return already will stop the code.
            case 2:
               return "Tuesday";
             // We do not need to use break. Return already will stop the code.
            case 3:
               return "Wednesday";
             // We do not need to use break. Return already will stop the code.
            case 4:
                return  "Thursday";
             // We do not need to use break. Return already will stop the code.
            case 5:
                return  "Friday";
             // We do not need to use break. Return already will stop the code.
            case 6:
                return "Saturday";
             // We do not need to use break. Return already will stop the code.
            case 7:
                return "Sunday";
             // We do not need to use break. Return already will stop the code.
            default:
                return "Invalid";
             // We do not need to use break. Return already will stop the code.
        }

    }
/*
 String strDay = "";
        switch (day) {
            case 1:
               strDay = "Monday";
              break;
            case 2:
               strDay = "Tuesday";
              break;
            case 3:
                strDay = "Wednesday";
                break;
            case 4:
                strDay = "Thursday";
                break;
            case 5:
                strDay = "Friday";
                break;
            case 6:
                strDay = "Saturday";
                break;
            case 7:
                strDay = "Sunday";
                break;
            default:
                strDay = "Invalid";
        }
 */

}
