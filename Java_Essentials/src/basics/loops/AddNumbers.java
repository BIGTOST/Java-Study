package basics.loops;

import java.util.Scanner;

/*
 ? DO WHILE LOOP:
 ? Write a program that allows a user to enter two numbers
 ? and then sums up the two numbers. The User should be able to
 ? repeat this action until they indicate they are done.
 */

public class AddNumbers
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);
        boolean runAgain = true;
        double  num1,
                num2,
                sum;
        String answer = "";
        do {
            System.out.print("Enter the first number: ");
            num1 = scanf.nextDouble();

            System.out.print("Enter the second number: ");
            num2 = scanf.nextDouble();

            sum = num1 + num2;
            System.out.println("The sum is " + sum);

            System.out.print("Wanna stop the program Yes or No:");
            answer =  scanf.next();
            if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y"))
            {
                runAgain = false;
            }
        }while(runAgain);
        scanf.close();
    }
}
