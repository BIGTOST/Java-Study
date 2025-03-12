package basics.loops;

import java.util.Scanner;

/*
 ? NESTED LOOP:
 ? Find the average of each student's test scores
 */

public class AverageTestScores
{
    public static void main(String[] args)
    {
        //* Initializing the variables and obj
        Scanner scanf = new Scanner(System.in);
        int numberOfStudents = 24,
                numberOfTests = 4;

        //* Process all students
        for (int i = 0; i< numberOfStudents; i++)
        {
            double total = 0;
            //* Process a student's test score
            for (int j = 0; j < numberOfTests ; j++)
            {
                System.out.print("Enter the score for Test #"+(j+1));
                total += scanf.nextDouble();
            }

            double average = total*numberOfTests;
            System.out.println("The test average for student #" + (i+1) + " is " + average + ".");
        }

        scanf.close();
    }
}
