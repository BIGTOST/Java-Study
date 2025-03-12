package basics.loops;

import java.util.Scanner;

/*
 ? FOR LOOP:
 ? Write a cashier program that will scan a given number of items
 ? and tally the cost
 */

public class Cashier
{
        public static void main(String[] args)
        {  //* Declaring OBJs and variables
            Scanner scanf = new Scanner(System.in);
            int quantity;
            double total=0;

            //* Get number of items to scan
            System.out.print("How many items you gonna scan: ");
            quantity =  scanf.nextInt();

            //* Create loop to iterate through all of the items and accumulate the cost
            for (int i = 0; i < quantity; i++)
            {
                System.out.print("Enter the product price: ");
                total +=  scanf.nextDouble();
            }
            scanf.close();
            System.out.println("Your total is $" + total+".");
        }
}
