package basics.methods;

import java.util.Scanner;

/*
 ? PASSING ARGUMENTS TO METHODS
 ? Write an 'instant credit check' rogrma that approves
 ? anyone who makes more than $25.00 and has a credit score
 ? of 700 or better. Reject all others
 */
public class InstantCreditCheck
{
    public static void main(String[] args)
    {
        //* Declare instaces and variables
        Scanner scanf = new Scanner(System.in);
        double salary = 0;
        int creditScore = 0;


        System.out.print("Enter your salary: ");
        salary = scanf.nextDouble();

        System.out.print("Enter your credit score: ");
        creditScore =  scanf.nextInt();

        //* Check if the user is qualified
        notifyUser(isUserQualified( salary, creditScore));

    }

    public static boolean isUserQualified(double salary, int creditScore)
    {

        if(salary > 25000 && creditScore >= 700)
            return true;
        return false;
    }

    public static void notifyUser(boolean isQualified)
    {
        if(isQualified)
        {
            System.out.println("Congrats! You are qualified!");
        }
        else
        {
            System.out.println("Sorry, You've been declined.");
        }
    }
}
