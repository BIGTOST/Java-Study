package basics.loops;

import java.util.Scanner;

/*
 ? BREAK STATEMENT:
 ? Search a String to determine if it contains the letter 'A'
 */
public class LetterSearch
{
    public static void main(String[] args)
    {
        //* Declare objs and variabels
        Scanner scanf =  new Scanner(System.in);
        String text;
        boolean letterFound = false;
        
        //* Get text
        System.out.print("Enter some text: ");
        text = scanf.next();

        scanf.close(); 
    
        //* Search text for letter A
        for (int i = 0; i < text.length() ; i++)
        {
            char currentLetter = text.charAt(i);
            if(currentLetter ==  'A' || currentLetter == 'a')
            {
                letterFound = true;
                break;
            }
        }
    }
}
