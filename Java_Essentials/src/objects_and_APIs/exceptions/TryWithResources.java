package objects_and_APIs.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResources
{
    public static void main(String[] args)
    {
        File inputFile = new File("./files/number.txt");
        File outputFile = new File("./files/number.txt");

        try(
                Scanner fileReader = new Scanner(inputFile);
                PrintWriter fileWriter = new PrintWriter(outputFile);
        )
        {
            while(fileReader.hasNext())
            {
                fileWriter.println(fileReader.nextDouble());
            }

        }
        catch (FileNotFoundException | InputMismatchException err)
        {
            err.printStackTrace();
        }
    }
}
