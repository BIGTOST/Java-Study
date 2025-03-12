package basics.decision_structure;


import java.util.Scanner;

/*
 * If Statement.
 * All salespeople get a payment of $1000 a weak
 * Salespeople who exceed 10 sales get an additional bonus of $250
 */
public class SalaryCalculator
{
    public static void main(String[] args)
    {
        //* Initialize know values
        int salary = 1000,
                bonus = 250,
                quotas = 10,
                sales = 0;

        //* Get Values for the unknown
        System.out.print("How many sales did the employee make this week: ");
        Scanner scanf = new Scanner(System.in);
        sales = scanf.nextInt();
        scanf.close();

        //* Quick detour for the bonus earners
        if(sales > quotas)
        {
            salary += bonus; //* can be salary = salary + bonus
        }

        //* Output
        System.out.println("The employee's pay is $" + salary);
    }
}
