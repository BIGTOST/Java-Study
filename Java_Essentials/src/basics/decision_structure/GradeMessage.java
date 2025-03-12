package basics.decision_structure;

import java.util.Scanner;

/*
 ? SWITCH
 ? Have a user enter their letter grade, and using a switch statement
 ? print out a message letting them know how they did
 */
public class GradeMessage
{
    public static void main(String[] args)
    {
        System.out.print("Enter your letter grade: ");
        Scanner scanf = new Scanner(System.in);
        String grade = scanf.next();
        scanf.close();

        String message;
        //* Normal witch
        switch (grade)
        {
            case "A":
            {
                message = "Excellent job!";
            }break;
            case "B":
            {
                message = "Great job!";
            }break;
            case "C":
            {
                message = "Good job!";
            }break;
            case "D":
            {
                message = "You need work a bit harder";
            }break;
            case "F":
            {
                message = "Uh oh!";
            }break;
            default:
            {
                message = "Error. Invalid grade";
            }break;
        }

        //* Switch expression
         message = switch (grade)
                    {
                        case "A" -> "Excellent job!";
                        case "B" -> "Great job!";
                        case "C" -> "Good Job!";
                        case "D" -> "You need work a bit harder";
                        case "F" -> "Uh oh!";
                        default  ->  "Error. Invalid grade";
                    };
    }
}
