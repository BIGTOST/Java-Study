package basics.gross_calculator;

import java.util.Scanner;

/*
 ? WHILE LOOP
 ? Each store employee makes $15 USD an hour. Write a program that allows the employee
 ? to enter the number of hours worked for the week. Do not allow overtime.
 */
public class GrossPayInputValidator
{
    public static void main(String[] args) {
        //* Initialize know variables
        int payRate = 15,
                maxHours = 40;
        double hoursWorked,
                gross;

        //* Get Input for unknow variables
        System.out.print("How manny hours did the employee work this week: ");
        Scanner scanf = new Scanner(System.in);
        hoursWorked = scanf.nextDouble();

        //* Validate Input
        while (hoursWorked > maxHours)
        {
            System.out.println("Invalid entry.You cannot work more then 40h. if input the rong value try again.");
            System.out.print("How manny houts did the employee work this week: ");
            hoursWorked = scanf.nextDouble();
        }
        scanf.close();

        //* Calculate gross
        gross = payRate * hoursWorked;
        System.out.println("Gross pay: $" + gross);
    }
}
