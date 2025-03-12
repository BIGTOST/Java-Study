package basics.gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator
{
    public static  void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // 1. Get the number of hours worked
        int hours = 0;
        System.out.print("How many hours did you work:");
        hours = scanner.nextInt();
        // 2. Get the hourly pay rate
        double payRate = 0;
        System.out.print("What is your pay rate: ");
        payRate = scanner.nextDouble();

        scanner.close();

        // 3. Multiply Hours and pay rate
        double grossPay = hours * payRate;

        // 4. Display Result
        System.out.println("Gross pay: "+grossPay);
    }
}
