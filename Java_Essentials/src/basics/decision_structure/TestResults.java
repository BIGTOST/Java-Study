package basics.decision_structure;

import java.util.Scanner;

/*
 ? IF-ELSE-IF
 ? Display the letter grade for a student based on their test score
 */
public class TestResults
{
    public static void main(String[] args)
    {
        //* Get the test score
        System.out.print("Enter your test score: ");
        Scanner scanf = new Scanner(System.in);
        double score =  scanf.nextDouble();
        scanf.close();

        //* Determine the letter grade
        char grade;

        if(score < 60)
        {
            grade = 'F';
        }
        else if (score < 70)
        {
            grade = 'D';
        }
        else if (score < 80)
        {
            grade = 'C';
        }
        else if (score < 90) {
            grade = 'B';

        }
        else
        {
            grade = 'A';
        }

    }
}
