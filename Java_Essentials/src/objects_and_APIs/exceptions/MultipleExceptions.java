package objects_and_APIs.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptions
{

    public static void main(String[] args)
    {
        File file = new File("./number.txt");

        try
        {
            Scanner fileReader = new Scanner(file);
            while(fileReader.hasNext())
            {
                System.out.println(fileReader.nextDouble());
            }
        }
        catch (FileNotFoundException err)
        {
            err.printStackTrace();
        }
        catch (InputMismatchException err)
        {
            err.printStackTrace();
        }
        catch (Exception err)
        {
            err.printStackTrace();
        }
    }
}
