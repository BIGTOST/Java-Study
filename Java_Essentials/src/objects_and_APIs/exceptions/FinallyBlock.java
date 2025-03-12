package objects_and_APIs.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock
{


    public static void main(String[] args)
    {
        File file = new File("./number.txt");
        Scanner fileReader = null;
        try
        {
            fileReader = new Scanner(file);
            while(fileReader.hasNext())
            {
                System.out.println(fileReader.nextDouble());
            }

        }
        catch (FileNotFoundException | InputMismatchException err)
        {
            err.printStackTrace();
        }
        finally {
            fileReader.close();
        }
    }
}
