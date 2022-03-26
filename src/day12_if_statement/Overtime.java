package day12_if_statement;

public class Overtime {
    public static void main(String[] args) {
        double hourlyRate = 20.5;
        double numberOfHours = 44;
        double overTime = numberOfHours - 40;
        double netPay;
        String messega ="";
        if (numberOfHours > 40) {
            netPay = (hourlyRate * 1.5) * overTime;
            netPay = hourlyRate * 40 + netPay;
            messega = "You worked " + numberOfHours + " hours at a rate of " + hourlyRate + ", but " + overTime +" of the hours were overtime, so you got" +
                    " an additional pay";
        } else {
            netPay = numberOfHours * hourlyRate;
        }

        System.out.println(netPay);
        System.out.println(messega);

    }
}
/*
create a double variable for your hourly rate
create a double variable for the number of hours worked

calculate your net pay, with consideration of overtime pay

    if you worked more than 40 hours you get overtime pay for the hours past 40. Overtime pay is 1.5 the normal rate
        (if you worked 43 hours, you will get 40 hours normal pay and 3 hours overtime pay)
*/