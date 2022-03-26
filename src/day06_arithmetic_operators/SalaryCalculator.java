package day06_arithmetic_operators;

public class SalaryCalculator {
    public static void main(String[] args) {

        int salary = 100_000;
        double stateTaxRate = 0.08,
                federalTaxRate = 0.21;

        double stateTax = salary * stateTaxRate;
        double federalTax = salary * federalTaxRate;
        double totalTax  = stateTax + federalTax;
        double salaryAfterTax = salary - totalTax;

        System.out.println(" Salary is: " + salary + "$" + "\n stateTaxRate is: " + stateTaxRate + "\n federalTaxRate is: " + federalTaxRate);
        System.out.println("------------------------------------------------");
        System.out.println(" Amount of stateTax is: " + stateTax+"$" + "\n Amount of federalTax is: " + federalTax+"$" + "\n Total tax is: " + totalTax+"$" );
        System.out.println("------------------------------------------------");
        System.out.println(" Salary after tax is: " + salaryAfterTax);













    }


}
/*
int HourlyRate = 50,
                WeeklyHours = 45;

        double StateTaxRate = 6.5,
                FederalTaxRate = 26.2;

        int salaryBeforeTax = HourlyRate * WeeklyHours * 52;
        double StateTax = salaryBeforeTax * StateTaxRate / 100,
                FederalTax = salaryBeforeTax * FederalTaxRate / 100,
                TotalTax = StateTax + FederalTax,
                NetIncome = salaryBeforeTax - TotalTax;

        System.out.println("Gross pay: " + salaryBeforeTax);
        System.out.println("Federal Tax: " + FederalTax);
        System.out.println("State Tax: " + StateTax);
        System.out.println("Total tax: " + TotalTax);
        System.out.println("Net income: " + NetIncome);
 */








   /*
    create a class SalaryCalculator

add a main method
        declare and assign these variables:

        salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax

        Sample date:
        100000 (salary)
        0.08 (state tax rate)
        0.21 (federal tax rate)

        Hint: use tax rates of 0.08 and 0.21 for 8% and 21%

        Print the tax rates, your total salary, the amount of tax for state and federal, the total tax amount, and your salary after all taxes
        */