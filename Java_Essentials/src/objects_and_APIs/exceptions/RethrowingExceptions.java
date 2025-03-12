package objects_and_APIs.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class RethrowingExceptions
{
    public static void main(String[] args) throws IOException, FileNotFoundException
    {
        rethrowException();
    }

    public static void rethrowException() throws IOException
    {
        File file = new File("nonexitente/file");
        file.createNewFile();

        Scanner fileReader = new Scanner(file);
    }
}
