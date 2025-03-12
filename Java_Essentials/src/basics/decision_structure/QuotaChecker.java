package basics.decision_structure;

import java.util.Scanner;

/*
? If-Else Statement.
? All salespeople are expected to make at least 10 sales each week.
? For those who do, they receive a congratulatory message.
? For those who don't, they are informed of how many sales they were short
*/
public class QuotaChecker
{
    public static void main(String[] args)
    {
        //* Initialize know values
        int quota = 10,
            sales = 0;

        //* Get values for the unknown
        System.out.print("How many sales did you make this week: ");
        Scanner scanf = new Scanner(System.in);
        sales = scanf.nextInt();

        //* Quick detour for the bonus earners
        if(sales >= quota)
        {
            System.out.println("Congrats! You've met your quota.");
        }
        else
        {
            int salesShort = quota - sales;
            System.out.println("You did not make your quota. You were " + salesShort +" sales short.");
        }
    }
}
